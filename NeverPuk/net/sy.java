package net;

import net._v;
import net.mk;
import net.mr;
import net.or;
import net.pi;
import net.xn;
import net.z_;
import net.zv;
import net.u.d;
import net.u.e;

public class sy extends mk {
   public static String I = "qwerty123";

   public sy() {
      super("AutoAuth", or.Player);
   }

   @mr
   public void u(zv var1) {
      d[] var2 = e.T();
      if(var1.F().contains("/reg") || var1.F().contains("/register") || var1.F().contains("Зарегестрируйтесь")) {
         p.sf.f("/reg " + I + " " + I);
         _v.A("Your password: " + I);
         pi.d("AutoAuth", "You are successfully registered!", 4, z_.SUCCESS);
         d.h(new d[3]);
      }

      if(var1.F().contains("Авторизуйтесь") || var1.F().contains("/l")) {
         p.sf.f("/login " + I);
      }

   }

   private static xn b(xn var0) {
      return var0;
   }
}
