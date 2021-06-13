package net.c9;

import java.util.UUID;
import net.xn;
import net.c9.b;
import net.yz.m_;

public class y {
   private static final m_ T = new m_("textures/entity/steve.png");
   private static final m_ y = new m_("textures/entity/alex.png");

   public static m_ H() {
      return T;
   }

   public static m_ l(UUID var0) {
      return c(var0)?y:T;
   }

   public static String k(UUID var0) {
      return c(var0)?"slim":"default";
   }

   private static boolean c(UUID var0) {
      int[] var1 = b.K();
      return (var0.hashCode() & 1) == 1;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
