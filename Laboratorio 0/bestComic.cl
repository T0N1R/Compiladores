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


class Main inherits IO {
    
    bestComic : Comic;

    comic1 : Comic;
    comic2 : Comic;
    comic3 : Comic;
    comic4 : Comic;

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
            
            out_string(comic1.comicName());
            out_string("\n");
            out_int(comic1.comicRating());
            out_string("\n");
            out_string(comic1.comicAuthor());
            out_string("\n");

            out_string("---------------------------------- \n");

            out_string(comic2.comicName());
            out_string("\n");
            out_int(comic2.comicRating());
            out_string("\n");
            out_string(comic2.comicAuthor());
            out_string("\n");

            out_string("---------------------------------- \n");

            out_string(comic3.comicName());
            out_string("\n");
            out_int(comic3.comicRating());
            out_string("\n");
            out_string(comic3.comicAuthor());
            out_string("\n");

            out_string("---------------------------------- \n");

            out_string(comic4.comicName());
            out_string("\n");
            out_int(comic4.comicRating());
            out_string("\n");
            out_string(comic4.comicAuthor());
            out_string("\n");

            out_string("---------------------------------- \n");

        }
    };

};
