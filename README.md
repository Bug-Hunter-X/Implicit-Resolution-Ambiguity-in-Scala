# Implicit Resolution Ambiguity in Scala

This example demonstrates a common issue in Scala related to implicit resolution ambiguity.  The `MyClass` utilizes an implicit conversion (`T => Int`) within its `myMethod`. While implicit conversions for `Int` and `String` are provided, attempting to use this with a `Double` results in a compilation error due to the lack of an implicit conversion from `Double` to `Int`.

The solution involves explicitly providing the conversion or defining a new implicit conversion.

## How to Reproduce

1.  Compile and run `ImplicitResolutionAmbiguity.scala`.
2.  Observe the successful execution with `Int` and `String` but the compilation failure with `Double`.

## Solution

The solution is presented in `ImplicitResolutionAmbiguitySolution.scala`.