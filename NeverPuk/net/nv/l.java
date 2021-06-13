package net.nv;

import javax.annotation.Nullable;
import net.xn;
import net.nv.f;
import net.nv.h;
import net.nv.t;

public class l {
   private static final int W = l.p.values().length;
   private static final String[] w = new String[W];
   private String[] S;
   private String[] u;

   public l() {
      this.S = w;
      this.u = w;
   }

   public void b(net.nx.f var1, final f var2, l.p var3, int var4) {
      String var5 = this.S[var3.z()];
      f var6 = new f() {
         public String Q() {
            return var2.Q();
         }

         public net.cb.t b() {
            return var2.b();
         }

         public void r(net.cb.t var1) {
            var2.r(var1);
         }

         public boolean n(int var1, String var2x) {
            return true;
         }

         public net.u.j z() {
            return var2.z();
         }

         public net.u.r A() {
            return var2.A();
         }

         public net.yv.r T() {
            return var2.T();
         }

         public net.ne.l P() {
            return var2.P();
         }

         public boolean x() {
            return var2.x();
         }

         public void n(l.p var1, int var2x) {
            var2.n(var1, var2x);
         }

         public net.nx.f E() {
            return var2.E();
         }
      };
      String var7 = h.M(var1, var6, var5);
      String var8 = this.u[var3.z()];
      net.nc.b var9 = var2.T().J();
      net.nc.l var10 = var9.e(var8);
      if(var9.M(var7, var10)) {
         net.nc.o var11 = var9.p(var7, var10);
         var11.A(var4);
      }

   }

   public void S(net.nj.f var1) {
      String[] var2 = t.Y();
      if(var1.K("CommandStats", 10)) {
         net.nj.f var3 = var1.o("CommandStats");
         l.p[] var4 = l.p.values();
         int var5 = var4.length;
         int var6 = 0;
         if(var6 < var5) {
            l.p var7 = var4[var6];
            String var8 = var7.f() + "Name";
            String var9 = var7.f() + "Objective";
            if(var3.K(var8, 8) && var3.K(var9, 8)) {
               String var10 = var3.J(var8);
               String var11 = var3.J(var9);
               w(this, var7, var10, var11);
            }

            ++var6;
         }
      }

   }

   public void y(net.nj.f var1) {
      net.nj.f var2 = new net.nj.f();

      for(l.p var6 : l.p.values()) {
         String var7 = this.S[var6.z()];
         String var8 = this.u[var6.z()];
         var2.b(var6.f() + "Name", var7);
         var2.b(var6.f() + "Objective", var8);
      }

      if(!var2.N()) {
         var1.K("CommandStats", var2);
      }

   }

   public static void w(l var0, l.p var1, @Nullable String var2, @Nullable String var3) {
      if(!var2.isEmpty() && !var3.isEmpty()) {
         if(var0.S == w || var0.u == w) {
            var0.S = new String[W];
            var0.u = new String[W];
         }

         var0.S[var1.z()] = var2;
         var0.u[var1.z()] = var3;
      } else {
         w(var0, var1);
      }

   }

   private static void w(l var0, l.p var1) {
      if(var0.S != w && var0.u != w) {
         var0.S[var1.z()] = null;
         var0.u[var1.z()] = null;
         boolean var2 = true;

         for(l.p var6 : l.p.values()) {
            if(var0.S[var6.z()] != null && var0.u[var6.z()] != null) {
               var2 = false;
               break;
            }
         }

         var0.S = w;
         var0.u = w;
      }

   }

   public void M(l var1) {
      for(l.p var5 : l.p.values()) {
         w(this, var5, var1.S[var5.z()], var1.u[var5.z()]);
      }

   }

   private static Exception a(Exception var0) {
      return var0;
   }

   public static enum p {
      SUCCESS_COUNT(0, "SuccessCount"),
      AFFECTED_BLOCKS(1, "AffectedBlocks"),
      AFFECTED_ENTITIES(2, "AffectedEntities"),
      AFFECTED_ITEMS(3, "AffectedItems"),
      QUERY_RESULT(4, "QueryResult");

      final int U;
      final String h;

      private p(int var3, String var4) {
         this.U = var3;
         this.h = var4;
      }

      public int z() {
         return this.U;
      }

      public String f() {
         return this.h;
      }

      public static String[] Z() {
         t.Y();
         String[] var1 = new String[values().length];
         int var2 = 0;
         l.p[] var3 = values();
         int var4 = var3.length;
         int var5 = 0;
         if(var5 < var4) {
            l.p var6 = var3[var5];
            var1[var2++] = var6.f();
            ++var5;
         }

         return var1;
      }

      @Nullable
      public static l.p B(String var0) {
         t.Y();
         l.p[] var2 = values();
         int var3 = var2.length;
         int var4 = 0;
         if(var4 < var3) {
            l.p var5 = var2[var4];
            if(var5.f().equals(var0)) {
               return var5;
            }

            ++var4;
         }

         return null;
      }

      private static xn a(xn var0) {
         return var0;
      }
   }
}
