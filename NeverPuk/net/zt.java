package net;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import net.o9;
import net.xn;
import net.u.d;

public class zt {
   private final List x = new ArrayList();
   private static String[] Z;

   public void d(o9 var1) {
      this.x.add(var1);
   }

   public void M(String var1) {
      G();
      this.x.add(new o9(var1));
      if(d.y() == null) {
         S(new String[2]);
      }

   }

   public boolean o(String var1) {
      return this.x.stream().anyMatch((var1x) -> {
         return var1x.M().equals(var1);
      });
   }

   public void l(String var1) {
      this.x.removeIf((var1x) -> {
         return var1x.M().equalsIgnoreCase(var1);
      });
   }

   public List G() {
      return this.x;
   }

   public o9 N(String var1) {
      String[] var2 = G();
      o9 var10000 = (o9)this.x.stream().filter((var1x) -> {
         return var1x.M().equals(var1);
      }).findFirst().get();
      d.h(new d[1]);
      return var10000;
   }

   public static void S(String[] var0) {
      Z = var0;
   }

   public static String[] G() {
      return Z;
   }

   private static xn a(xn var0) {
      return var0;
   }

   static {
      if(G() != null) {
         S(new String[3]);
      }

   }
}
