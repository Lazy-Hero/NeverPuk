package net.cp;

import net.xn;
import net.cp.v;

public class d {
   public String U;
   public String C;
   public String X;
   public String I;
   public long o;
   public int Z = 340;
   public String c = "1.12.2";
   public boolean H;
   public String d;
   private d.r r = d.r.PROMPT;
   private String h;
   private boolean b;

   public d(String var1, String var2, boolean var3) {
      this.U = var1;
      this.C = var2;
      this.b = var3;
   }

   public net.nj.f S() {
      net.nj.f var1 = new net.nj.f();
      var1.b("name", this.U);
      var1.b("ip", this.C);
      if(this.h != null) {
         var1.b("icon", this.h);
      }

      if(this.r == d.r.ENABLED) {
         var1.c("acceptTextures", true);
      } else if(this.r == d.r.DISABLED) {
         var1.c("acceptTextures", false);
      }

      return var1;
   }

   public d.r z() {
      return this.r;
   }

   public void F(d.r var1) {
      this.r = var1;
   }

   public static d t(net.nj.f var0) {
      v.s();
      d var2 = new d(var0.J("name"), var0.J("ip"), false);
      if(var0.K("icon", 8)) {
         var2.Q(var0.J("icon"));
      }

      if(var0.K("acceptTextures", 1)) {
         if(var0.i("acceptTextures")) {
            var2.F(d.r.ENABLED);
         }

         var2.F(d.r.DISABLED);
      }

      var2.F(d.r.PROMPT);
      return var2;
   }

   public String f() {
      return this.h;
   }

   public void Q(String var1) {
      this.h = var1;
   }

   public boolean Z() {
      return this.b;
   }

   public void I(d var1) {
      this.C = var1.C;
      this.U = var1.U;
      this.F(var1.z());
      this.h = var1.h;
      this.b = var1.b;
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static enum r {
      ENABLED("enabled"),
      DISABLED("disabled"),
      PROMPT("prompt");

      private final net.cb.t V;

      private r(String var3) {
         this.V = new net.cb.h("addServer.resourcePack." + var3, new Object[0]);
      }

      public net.cb.t v() {
         return this.V;
      }
   }
}
