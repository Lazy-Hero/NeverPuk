package net.ni;

import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.n0.kw;
import net.ni.s;
import net.ni.v;
import net.ni.w;

public class g extends v implements net.yv.y {
   private String y;
   private kw C = kw.BLACK;
   private net.nj.h h;
   private boolean i;
   private List f;
   private List r;
   private String O;

   public void p(ks var1, boolean var2) {
      this.h = null;
      net.nj.f var3 = var1.j("BlockEntityTag");
      if(var3.K("Patterns", 9)) {
         this.h = var3.A("Patterns", 10).j();
      }

      this.C = P(var1);
      this.f = null;
      this.r = null;
      this.O = "";
      this.i = true;
      this.y = var1.v()?var1.j():null;
   }

   public String Q() {
      return this.H()?this.y:"banner";
   }

   public boolean H() {
      return this.y != null && !this.y.isEmpty();
   }

   public net.cb.t b() {
      return (net.cb.t)(this.H()?new net.cb.l(this.Q()):new net.cb.h(this.Q(), new Object[0]));
   }

   public net.nj.f b(net.nj.f var1) {
      super.b(var1);
      var1.r("Base", this.C.G());
      if(this.h != null) {
         var1.K("Patterns", this.h);
      }

      if(this.H()) {
         var1.b("CustomName", this.y);
      }

      return var1;
   }

   public void G(net.nj.f var1) {
      super.G(var1);
      if(var1.K("CustomName", 8)) {
         this.y = var1.J("CustomName");
      }

      this.C = kw.q(var1.P("Base"));
      this.h = var1.A("Patterns", 10);
      this.f = null;
      this.r = null;
      this.O = null;
      this.i = true;
   }

   @Nullable
   public net.no.k q() {
      return new net.no.k(this.S, 6, this.e());
   }

   public net.nj.f e() {
      return this.b(new net.nj.f());
   }

   public static int h(ks var0) {
      net.nj.f var1 = var0.j("BlockEntityTag");
      return var1.G("Patterns")?var1.A("Patterns", 10).z():0;
   }

   public List Z() {
      this.N();
      return this.f;
   }

   public List n() {
      this.N();
      return this.r;
   }

   public String L() {
      this.N();
      return this.O;
   }

   private void N() {
      int[] var1 = w.C();
      if(this.f == null || this.r == null || this.O == null) {
         if(!this.i) {
            this.O = "";
         }

         this.f = Lists.newArrayList();
         this.r = Lists.newArrayList();
         this.f.add(s.BASE);
         this.r.add(this.C);
         this.O = "b" + this.C.G();
         if(this.h != null) {
            int var2 = 0;
            if(var2 < this.h.z()) {
               net.nj.f var3 = this.h.i(var2);
               s var4 = s.z(var3.J("Pattern"));
               this.f.add(var4);
               int var5 = var3.P("Color");
               this.r.add(kw.q(var5));
               this.O = this.O + var4.z() + var5;
               ++var2;
            }
         }
      }

   }

   public static void D(ks var0) {
      net.nj.f var1 = var0.j("BlockEntityTag");
      if(var1.K("Patterns", 9)) {
         net.nj.h var2 = var1.A("Patterns", 10);
         if(!var2.N()) {
            var2.K(var2.z() - 1);
            if(var2.N()) {
               var0.o().A("BlockEntityTag");
               if(var0.o().N()) {
                  var0.t((net.nj.f)null);
               }
            }
         }
      }

   }

   public ks g() {
      ks var1 = net.n0.c.G(this.C, this.h);
      if(this.H()) {
         var1.m(this.Q());
      }

      return var1;
   }

   public static kw P(ks var0) {
      net.nj.f var1 = var0.j("BlockEntityTag");
      return var1.G("Base")?kw.q(var1.P("Base")):kw.BLACK;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
