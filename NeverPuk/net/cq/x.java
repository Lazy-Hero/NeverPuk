package net.cq;

import com.mojang.authlib.properties.PropertyMap;
import java.io.File;
import java.net.Proxy;
import javax.annotation.Nullable;
import net.xn;
import net.c9.n;
import net.u.d;
import net.yz.u;

public class x {
   public final x.s W;
   public final x.r r;
   public final x.w F;
   public final x.a p;
   public final x.j f;
   private static boolean U;

   public x(x.s var1, x.r var2, x.w var3, x.a var4, x.j var5) {
      this.W = var1;
      this.r = var2;
      this.F = var3;
      R();
      this.p = var4;
      this.f = var5;
      if(d.y() == null) {
         K(false);
      }

   }

   public static void K(boolean var0) {
      U = var0;
   }

   public static boolean R() {
      return U;
   }

   public static boolean z() {
      boolean var0 = R();
      return true;
   }

   private static xn a(xn var0) {
      return var0;
   }

   static {
      if(!z()) {
         K(true);
      }

   }

   public static class a {
      public final boolean r;
      public final String B;
      public final String b;

      public a(boolean var1, String var2, String var3) {
         this.r = var1;
         this.B = var2;
         this.b = var3;
      }
   }

   public static class j {
      public final String P;
      public final int J;

      public j(String var1, int var2) {
         this.P = var1;
         this.J = var2;
      }
   }

   public static class r {
      public final int U;
      public final int q;
      public final boolean Y;
      public final boolean w;

      public r(int var1, int var2, boolean var3, boolean var4) {
         this.U = var1;
         this.q = var2;
         this.Y = var3;
         this.w = var4;
      }
   }

   public static class s {
      public final u j;
      public final PropertyMap i;
      public final PropertyMap x;
      public final Proxy k;

      public s(u var1, PropertyMap var2, PropertyMap var3, Proxy var4) {
         this.j = var1;
         this.i = var2;
         this.x = var3;
         this.k = var4;
      }
   }

   public static class w {
      public final File F;
      public final File r;
      public final File q;
      public final String t;

      public w(File var1, File var2, File var3, @Nullable String var4) {
         this.F = var1;
         this.r = var2;
         this.q = var3;
         this.t = var4;
      }

      public n p() {
         return (n)(this.t == null?new net.c9.z(this.q):new n(this.q, this.t));
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
