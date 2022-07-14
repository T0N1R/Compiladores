class Comic {
    name : String;
    rating : Int;
    author : String;

    comicName(): String { name };
    comicRating(): Int { rating };
    comicAuthor(): String { author };

    set_comic(cname : String, crating : Int, cauthor : String) : SELF_TYPE {
        {
            name <- cname;
            rating <- crating;
            author <- cauthor;
            self;
        }
    };

    set_name(c_name : String) : SELF_TYPE {
      {
         name <- c_name;
         self;
      }
    };

    set_rating(c_rating : Int) : SELF_TYPE {
      {
        rating <- c_rating;
        self;
      }
    };

    set_author(c_author : String) : SELF_TYPE {
      {
        author <- c_author;
        self;
      }
    };

};

class List inherits Comic{
  -- Define operations on empty lists.

  isNil() : Bool { true };

  -- Since abort() has return type Object and head() has return type
  -- Int, we need to have an Int as the result of the method body,
  -- even though abort() never returns.

  head()  : Int { { abort(); 0; } };

  -- As for head(), the self is just to make sure the return type of
  -- tail() is correct.

  headName()  : String { { abort(); ""; } };

  headAuthor() : String { { abort(); ""; } };

  tail()  : List { { abort(); self; } };

  -- When we cons and element onto the empty list we get a non-empty
  -- list. The (new Cons) expression creates a new list cell of class
  -- Cons, which is initialized by a dispatch to init().
  -- The result of init() is an element of class Cons, but it
  -- conforms to the return type List, because Cons is a subclass of
  -- List.

  cons(i : Comic) : List {
    (new Cons).init(i, self)
  };

};


(*
 *  Cons inherits all operations from List. We can reuse only the cons
 *  method though, because adding an element to the front of an emtpy
 *  list is the same as adding it to the front of a non empty
 *  list. All other methods have to be redefined, since the behaviour
 *  for them is different from the empty list.
 *
 *  Cons needs two attributes to hold the integer of this list
 *  cell and to hold the rest of the list.
 *
 *  The init() method is used by the cons() method to initialize the
 *  cell.
 *)

class Cons inherits List {

   car : Comic;	-- The element in this list cell

   cdr : List;	-- The rest of the list

   isNil() : Bool { false };

   head()  : Int { car.comicRating() };

   headName() : String { car.comicName() };

   headAuthor() : String  { car.comicAuthor() };

   tail()  : List { cdr };

   init(i : Comic, rest : List) : List {
      {
	 car <- i;
	 cdr <- rest;
	 self;
      }
   };

};


class Main inherits IO {
    
    bestComic : Comic;

    comic1 : Comic;
    comic2 : Comic;
    comic3 : Comic;
    comic4 : Comic;

    comic_list : List;

    -- Imprimir los comics de la lista (nombre, rating y autor)
    print_list(l : List) : Object {
      if l.isNil() then out_string("\n")
                   else {
        out_string("Nombre: ");
			   out_string(l.headName());
         out_string("\n");
        out_string("Rating: ");
         out_int(l.head());
         out_string("\n");
        out_string("Autor: ");
         out_string(l.headAuthor());
         out_string("\n");
			   out_string("---------------------------------- \n");
			   print_list(l.tail());
		        }
      fi
   };

    main(): Object {
        {
            comic1 <- (new Comic);
            comic2 <- (new Comic);
            comic3 <- (new Comic);
            comic4 <- (new Comic);

            comic1.set_name("Inhumans");
            comic1.set_rating(40);
            comic1.set_author("Paul Jenkins");


            comic2.set_name("SWORD");
            comic2.set_rating(90);
            comic2.set_author("Al Ewing");


            comic3.set_name("Hellions");
            comic3.set_rating(95);
            comic3.set_author("Zeb Wells");


            comic4.set_name("House of X Powers of X");
            comic4.set_rating(100);
            comic4.set_author("Jonathan Hickman");

            comic_list <- new List.cons(comic1).cons(comic2).cons(comic3).cons(comic4);
            print_list(comic_list);
        }
    };

};
