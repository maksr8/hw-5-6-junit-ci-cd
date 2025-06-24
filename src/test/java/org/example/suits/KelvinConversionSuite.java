package org.example.suits;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages({"org.example"})
@IncludeTags("kelvin")
public class KelvinConversionSuite {

}
