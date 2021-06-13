package net.yz;

import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.yz.e;
import net.yz.m_;

public class as {
   private final List K = Lists.newArrayList();
   private final net.ne.a x;
   private int J;
   private int y;
   private int T;
   private boolean G;
   private boolean h;
   private String E;

   public as(net.ne.a var1) {
      this.x = var1;
   }

   public void M() {
      this.P();
      if(this.x.K()) {
         net.y9.l var1 = this.x.hl.Z(new net.u.j(this.x.b, this.x.i().u, this.x.hr)).Q();
         if(var1 == net.nb.f.K) {
            this.E = "ladder";
         } else if(var1 == net.nb.f.To) {
            this.E = "vines";
         }
      } else if(this.x.p()) {
         this.E = "water";
      }

   }

   public void R(net.yz.z var1, float var2, float var3) {
      this.Q();
      this.M();
      e var4 = new e(var1, this.x.x, var2, var3, this.E, this.x.hI);
      this.K.add(var4);
      this.J = this.x.x;
      this.h = true;
      if(var4.r() && !this.G && this.x.P()) {
         this.G = true;
         this.y = this.x.x;
         this.T = this.y;
         this.x.w();
      }

   }

   public net.cb.t A() {
      int var1 = m_.J();
      if(this.K.isEmpty()) {
         return new net.cb.h("death.attack.generic", new Object[]{this.x.b()});
      } else {
         e var2 = this.I();
         e var3 = (e)this.K.get(this.K.size() - 1);
         net.cb.t var4 = var3.x();
         net.ne.l var5 = var3.c().v();
         if(var2 != null && var3.c() == net.yz.z.H) {
            net.cb.t var7 = var2.x();
            if(var2.c() != net.yz.z.H && var2.c() != net.yz.z.s) {
               if(var7 != null && (var4 == null || !var7.equals(var4))) {
                  net.ne.l var8 = var2.c().v();
                  ks var9 = var8 instanceof net.ne.a?((net.ne.a)var8).S():ks.a;
                  if(!var9.B() && var9.v()) {
                     new net.cb.h("death.fell.assist.item", new Object[]{this.x.b(), var7, var9.b()});
                  }

                  new net.cb.h("death.fell.assist", new Object[]{this.x.b(), var7});
               }

               if(var4 != null) {
                  ks var10 = var5 instanceof net.ne.a?((net.ne.a)var5).S():ks.a;
                  if(!var10.B() && var10.v()) {
                     new net.cb.h("death.fell.finish.item", new Object[]{this.x.b(), var4, var10.b()});
                  }

                  new net.cb.h("death.fell.finish", new Object[]{this.x.b(), var4});
               }

               new net.cb.h("death.fell.killer", new Object[]{this.x.b()});
            }

            new net.cb.h("death.fell.accident." + this.d(var2), new Object[]{this.x.b()});
         }

         net.cb.t var6 = var3.c().Z(this.x);
         return var6;
      }
   }

   @Nullable
   public net.ne.a Y() {
      net.ne.a var1 = null;
      net.r.r var2 = null;
      float var3 = 0.0F;
      float var4 = 0.0F;

      for(e var6 : this.K) {
         if(var6.c().v() instanceof net.r.r && var6.b() > var4) {
            var4 = var6.b();
            var2 = (net.r.r)var6.c().v();
         }

         if(var6.c().v() instanceof net.ne.a && var6.b() > var3) {
            var3 = var6.b();
            var1 = (net.ne.a)var6.c().v();
         }
      }

      float var8;
      int var10000 = (var8 = var4 - var3 / 3.0F) == 0.0F?0:(var8 < 0.0F?-1:1);
      return var2;
   }

   @Nullable
   private e I() {
      Object var1 = null;
      Object var2 = null;
      float var3 = 0.0F;
      float var4 = 0.0F;

      for(int var5 = 0; var5 < this.K.size(); ++var5) {
         e var6 = (e)this.K.get(var5);
         e var7 = (e)this.K.get(var5 - 1);
         if((var6.c() == net.yz.z.H || var6.c() == net.yz.z.s) && var6.t() > 0.0F && var6.t() > var4) {
            var4 = var6.t();
         }

         if(var6.L() != null && var6.b() > var3) {
            var3 = var6.b();
         }
      }

      float var9;
      int var10000 = (var9 = var4 - 5.0F) == 0.0F?0:(var9 < 0.0F?-1:1);
      float var10;
      var10000 = (var10 = var3 - 5.0F) == 0.0F?0:(var10 < 0.0F?-1:1);
      return null;
   }

   private String d(e var1) {
      return var1.L() == null?"generic":var1.L();
   }

   public int T() {
      return this.G?this.x.x - this.y:this.T - this.y;
   }

   private void P() {
      this.E = null;
   }

   public void Q() {
      int var1 = this.G?300:100;
      if(this.h && (!this.x.P() || this.x.x - this.J > var1)) {
         boolean var2 = this.G;
         this.h = false;
         this.G = false;
         this.T = this.x.x;
         this.x.S();
         this.K.clear();
      }

   }

   public net.ne.a M() {
      return this.x;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
