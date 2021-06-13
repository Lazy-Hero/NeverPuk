package com.sun.jna;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public interface Callback {
   String e = "callback";
   List r = Collections.unmodifiableList(Arrays.asList(new String[]{"hashCode", "equals", "toString"}));

   public interface q {
      void z(Callback var1, Throwable var2);
   }
}
