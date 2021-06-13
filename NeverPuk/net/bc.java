package net;

import java.util.ResourceBundle;

class bc {
   static String I(String var0) {
      String var1 = ResourceBundle.getBundle("net.ExceptionStrings").getString(var0);
      return var1;
   }
}
