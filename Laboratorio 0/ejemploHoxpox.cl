class Comic {

   var : String <- "";
   value() : String { var };

   set_var(name : String) : SELF_TYPE {
      {
         var <- name;
         self;
      }
   };

};

class Main inherits IO {
  
  hoxpox : Comic;
  
  main(): Object {
    {
    hoxpox <- (new Comic);
    hoxpox.set_var("house of x powers of x");
    out_string(hoxpox.value());
    }
  };
};
