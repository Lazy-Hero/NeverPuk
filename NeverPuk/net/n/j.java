package net.n;

import com.google.gson.JsonObject;
import java.io.File;
import java.net.SocketAddress;
import net.xn;
import net.n.a;
import net.n.f;
import net.n.r;
import net.n.y;

public class j extends r {
   public j(File var1) {
      super(var1);
   }

   protected a x(JsonObject var1) {
      return new f(var1);
   }

   public boolean S(SocketAddress var1) {
      String var2 = this.J(var1);
      return this.d(var2);
   }

   public f V(SocketAddress var1) {
      String var2 = this.J(var1);
      return (f)this.g(var2);
   }

   private String J(SocketAddress var1) {
      y.c();
      String var3 = var1.toString();
      if(var3.contains("/")) {
         var3 = var3.substring(var3.indexOf(47) + 1);
      }

      if(var3.contains(":")) {
         var3 = var3.substring(0, var3.indexOf(58));
      }

      return var3;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
