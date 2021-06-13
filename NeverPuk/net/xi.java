package net;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import net.xa;
import net.xn;
import net.u.d;

public class xi {
   public List Q = new ArrayList();

   public xa w(int var1) {
      xa.v();
      xa var10000 = (xa)this.Q().stream().filter((var1x) -> {
         String[] var2 = xa.v();
         return var1x.Q() == var1;
      }).findFirst().orElse((Object)null);
      if(d.y() == null) {
         xa.E(new String[4]);
      }

      return var10000;
   }

   public List Q() {
      return this.Q;
   }

   public void v(xa var1) {
      this.Q.add(var1);
   }

   public void P(int var1) {
      this.Q.removeIf((var1x) -> {
         String[] var2 = xa.v();
         return var1x.Q() == var1;
      });
   }

   public void j(xa var1) {
      this.Q.remove(var1);
   }

   private static xn a(xn var0) {
      return var0;
   }
}
