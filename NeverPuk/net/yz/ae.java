package net.yz;

import net.xn;
import net.yz.b;
import net.yz.m_;

public class ae extends b.g {
   private final net.nj.f o;

   public ae() {
      super(1);
      this.o = new net.nj.f();
      this.o.b("id", "minecraft:pig");
   }

   public ae(net.nj.f var1) {
      this(var1.K("Weight", 99)?var1.P("Weight"):1, var1.o("Entity"));
   }

   public ae(int var1, net.nj.f var2) {
      super(var1);
      this.o = var2;
   }

   public net.nj.f L() {
      m_.J();
      net.nj.f var2 = new net.nj.f();
      if(!this.o.K("id", 8)) {
         this.o.b("id", "minecraft:pig");
      }

      if(!this.o.J("id").contains(":")) {
         this.o.b("id", (new m_(this.o.J("id"))).toString());
      }

      var2.K("Entity", this.o);
      var2.r("Weight", this.a);
      return var2;
   }

   public net.nj.f x() {
      return this.o;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
