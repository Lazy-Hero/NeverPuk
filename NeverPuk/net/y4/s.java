package net.y4;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import net.xn;
import net.y4.b;
import net.y4.p;
import net.y4.v;

public abstract class s {
   protected List J = Lists.newLinkedList();
   protected v K;
   private int o;
   private int W;

   public s() {
   }

   public s(int var1, int var2) {
      this.o = var1;
      this.W = var2;
   }

   public v r() {
      return this.K;
   }

   public List o() {
      return this.J;
   }

   public void d(net.yv.r var1, Random var2, v var3) {
      Iterator var4 = this.J.iterator();

      while(var4.hasNext()) {
         p var5 = (p)var4.next();
         if(var5.J().F(var3) && !var5.Q(var1, var2, var3)) {
            var4.remove();
         }
      }

   }

   protected void O() {
      this.K = v.T();

      for(p var2 : this.J) {
         this.K.W(var2.J());
      }

   }

   public net.nj.f D(int var1, int var2) {
      net.nj.f var4 = new net.nj.f();
      p.d();
      var4.b("id", b.y(this));
      var4.r("ChunkX", var1);
      var4.r("ChunkZ", var2);
      var4.K("BB", this.K.I());
      net.nj.h var5 = new net.nj.h();
      Iterator var6 = this.J.iterator();
      if(var6.hasNext()) {
         p var7 = (p)var6.next();
         var5.m(var7.b());
      }

      var4.K("Children", var5);
      this.N(var4);
      return var4;
   }

   public void N(net.nj.f var1) {
   }

   public void U(net.yv.r var1, net.nj.f var2) {
      this.o = var2.P("ChunkX");
      this.W = var2.P("ChunkZ");
      if(var2.G("BB")) {
         this.K = new v(var2.g("BB"));
      }

      net.nj.h var3 = var2.A("Children", 10);

      for(int var4 = 0; var4 < var3.z(); ++var4) {
         this.J.add(b.h(var3.i(var4), var1));
      }

      this.V(var2);
   }

   public void V(net.nj.f var1) {
   }

   protected void X(net.yv.r var1, Random var2, int var3) {
      int var5 = var1.k() - var3;
      p.d();
      int var6 = this.K.I() + 1;
      if(var6 < var5) {
         var6 += var2.nextInt(var5 - var6);
      }

      int var7 = var6 - this.K.P;
      this.K.D(0, var7, 0);
      Iterator var8 = this.J.iterator();
      if(var8.hasNext()) {
         p var9 = (p)var8.next();
         var9.g(0, var7, 0);
      }

   }

   protected void n(net.yv.r var1, Random var2, int var3, int var4) {
      int var5 = var4 - var3 + 1 - this.K.I();
      int var6;
      if(var5 > 1) {
         var6 = var3 + var2.nextInt(var5);
      } else {
         var6 = var3;
      }

      int var7 = var6 - this.K.D;
      this.K.D(0, var7, 0);

      for(p var9 : this.J) {
         var9.g(0, var7, 0);
      }

   }

   public boolean d() {
      return true;
   }

   public boolean U(net.u.p var1) {
      return true;
   }

   public void H(net.u.p var1) {
   }

   public int p() {
      return this.o;
   }

   public int b() {
      return this.W;
   }

   private static xn b(xn var0) {
      return var0;
   }
}
