/* Rules for using abstract classes ; 

1) You cannot create an object directly from an abstract class 
*) All inherited (extended) classes must use the abstracted class defined (Personal note rule, kinda similar to rule 3)
2) it is supposed to have atleast one abstract method (an abstract method has no method body, just the signature ending with a semicolon ";")
3) Every abstract method must be overridden by a concrete subclass
4) Constructors are allowed for the abstract classes and they can be accessed using super from the subclass
5) Abstract methods cannot be private
6) Abstract methods cannot be static or final
*/