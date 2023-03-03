# Guice 101
Tagging a constructor with @Inject is essentially telling Guice where you want a dependency to be provided for you. Not only does this work for constructors but you can also apply @Inject to fields or methods.
### Guice Injection Styles

|LOCATION|INJECTION ORDER|MOTIVATION|COMMENT|
|---|---|---|---|
|Constructor	First|	Class immutability Mandatory dependencies|	Only one allowed with @Inject.|
|Field	Second	|Quick prototyping Code that doesn't need testing|	Injection order is random.|
|Setter	Third	|Dealing with legacy classes Optional dependencies|	Injection order is random.|

**Note**: Remember that immutability also means thread safety.

The @Inject annotation has an optional property, which is set to false by default but can be set to true, which tells Guice to ignore values for which there are no bindings available. This applies to the entire injection point though