package net;

import net.bx;
import net.y6.jb;

public abstract class iy {
   private final Class Z;
   private final String K;
   private final float j;
   private static String p;

   public iy(Class var1, String var2, float var3) {
      this.Z = var1;
      this.K = var2;
      this.j = var3;
   }

   public Class b() {
      return this.Z;
   }

   public String f() {
      return this.K;
   }

   public float p() {
      return this.j;
   }

   public abstract net.y6.z J();

   public abstract jb k(net.y6.z var1, String var2);

   public abstract bx A(net.y6.z var1, float var2);

   public static void V(String var0) {
      p = var0;
   }

   public static String A() {
      return p;
   }

   static {
      if(A() == null) {
         V("NkBMzc");
      }

   }
}
