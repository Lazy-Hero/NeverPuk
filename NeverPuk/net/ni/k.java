package net.ni;

import java.util.Iterator;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.ni.f;
import net.ni.v;
import net.ni.w;
import net.nl.z1;
import net.y9.z_;
import net.yz.aq;

public class k extends f implements net.yz.i {
   private net.yz.w n = net.yz.w.C(27, ks.a);
   public boolean t;
   public k j;
   public k p;
   public k d;
   public k X;
   public float z;
   public float R;
   public int x;
   private int E;
   private z_.o u;

   public k() {
   }

   public k(z_.o var1) {
      this.u = var1;
   }

   public int e() {
      return 27;
   }

   public boolean N() {
      for(ks var2 : this.n) {
         if(!var2.B()) {
            return false;
         }
      }

      return true;
   }

   public String Q() {
      return this.H()?this.T:"container.chest";
   }

   public static void l(net.c0.d var0) {
      var0.U(net.c0.q.BLOCK_ENTITY, new net.ng.u(k.class, new String[]{"Items"}));
   }

   public void G(net.nj.f var1) {
      super.G(var1);
      this.n = net.yz.w.C(this.e(), ks.a);
      if(!this.W(var1)) {
         net.nl.h.W(var1, this.n);
      }

      if(var1.K("CustomName", 8)) {
         this.T = var1.J("CustomName");
      }

   }

   public net.nj.f b(net.nj.f var1) {
      super.b((net.nj.f)var1);
      if(!this.A(var1)) {
         net.nl.h.l(var1, this.n);
      }

      if(this.H()) {
         var1.b("CustomName", this.T);
      }

      return var1;
   }

   public int m() {
      return 64;
   }

   public void K() {
      super.K();
      this.t = false;
   }

   private void f(k var1, aq var2) {
      if(var1.n()) {
         this.t = false;
      } else if(this.t) {
         switch(null.r[var2.ordinal()]) {
         case 1:
            if(this.j != var1) {
               this.t = false;
            }
            break;
         case 2:
            if(this.X != var1) {
               this.t = false;
            }
            break;
         case 3:
            if(this.p != var1) {
               this.t = false;
            }
            break;
         case 4:
            if(this.d != var1) {
               this.t = false;
            }
         }
      }

   }

   public void a() {
      if(!this.t) {
         this.t = true;
         this.d = this.T(aq.WEST);
         this.p = this.T(aq.EAST);
         this.j = this.T(aq.NORTH);
         this.X = this.T(aq.SOUTH);
      }

   }

   @Nullable
   protected k T(aq var1) {
      net.u.j var2 = this.S.C(var1);
      if(this.B(var2)) {
         v var3 = this.J.L(var2);
         if(var3 instanceof k) {
            k var4 = (k)var3;
            var4.f(this, var1.f());
            return var4;
         }
      }

      return null;
   }

   private boolean B(net.u.j var1) {
      if(this.J == null) {
         return false;
      } else {
         net.y9.l var2 = this.J.Z(var1).Q();
         return var2 instanceof z_ && ((z_)var2).a == this.r();
      }
   }

   public void m() {
      this.a();
      int var2 = this.S.t();
      w.C();
      int var3 = this.S.h();
      int var4 = this.S.y();
      ++this.E;
      if(!this.J.x && this.x != 0 && (this.E + var2 + var3 + var4) % 200 == 0) {
         this.x = 0;
         float var10000 = 5.0F;
         Iterator var6 = this.J.p(net.r.r.class, new net.u.e((double)((float)var2 - 5.0F), (double)((float)var3 - 5.0F), (double)((float)var4 - 5.0F), (double)((float)(var2 + 1) + 5.0F), (double)((float)(var3 + 1) + 5.0F), (double)((float)(var4 + 1) + 5.0F))).iterator();
         if(var6.hasNext()) {
            net.r.r var7 = (net.r.r)var6.next();
            if(var7.aG instanceof net.nl.a) {
               z1 var8 = ((net.nl.a)var7.aG).m();
               if(var8 == this || var8 instanceof net.nl.x && ((net.nl.x)var8).g(this)) {
                  ++this.x;
               }
            }
         }
      }

      this.R = this.z;
      float var17 = 0.1F;
      if(this.x > 0 && Float.compare(this.z, 0.0F) == 0 && this.j == null && this.d == null) {
         double var12 = (double)var2 + 0.5D;
         double var15 = (double)var4 + 0.5D;
         if(this.X != null) {
            var15 += 0.5D;
         }

         if(this.p != null) {
            var12 += 0.5D;
         }

         this.J.L((net.r.r)null, var12, (double)var3 + 0.5D, var15, net.nb.l.Q, net.yz.p.BLOCKS, 0.5F, this.J.G.nextFloat() * 0.1F + 0.9F);
      }

      if(this.x == 0 && this.z > 0.0F || this.x > 0 && this.z < 1.0F) {
         float var13 = this.z;
         if(this.x > 0) {
            this.z += 0.1F;
         }

         this.z -= 0.1F;
         if(this.z > 1.0F) {
            this.z = 1.0F;
         }

         float var14 = 0.5F;
         if(Float.compare(this.z, 0.5F) < 0 && Float.compare(var13, 0.5F) >= 0 && this.j == null && this.d == null) {
            double var16 = (double)var2 + 0.5D;
            double var10 = (double)var4 + 0.5D;
            if(this.X != null) {
               var10 += 0.5D;
            }

            if(this.p != null) {
               var16 += 0.5D;
            }

            this.J.L((net.r.r)null, var16, (double)var3 + 0.5D, var10, net.nb.l.KC, net.yz.p.BLOCKS, 0.5F, this.J.G.nextFloat() * 0.1F + 0.9F);
         }

         if(this.z < 0.0F) {
            this.z = 0.0F;
         }
      }

      if(net.u.d.y() == null) {
         w.M(new int[4]);
      }

   }

   public boolean q(int var1, int var2) {
      if(var1 == 1) {
         this.x = var2;
         return true;
      } else {
         return super.q(var1, var2);
      }
   }

   public void o(net.r.r var1) {
      if(!var1.VX()) {
         if(this.x < 0) {
            this.x = 0;
         }

         ++this.x;
         this.J.x(this.S, this.a(), 1, this.x);
         this.J.b(this.S, this.a(), false);
         if(this.r() == z_.o.TRAP) {
            this.J.b(this.S.b(), this.a(), false);
         }
      }

   }

   public void b(net.r.r var1) {
      if(!var1.VX() && this.a() instanceof z_) {
         --this.x;
         this.J.x(this.S, this.a(), 1, this.x);
         this.J.b(this.S, this.a(), false);
         if(this.r() == z_.o.TRAP) {
            this.J.b(this.S.b(), this.a(), false);
         }
      }

   }

   public void Z() {
      super.Z();
      this.K();
      this.a();
   }

   public z_.o r() {
      if(this.u == null) {
         if(this.J == null || !(this.a() instanceof z_)) {
            return z_.o.BASIC;
         }

         this.u = ((z_)this.a()).a;
      }

      return this.u;
   }

   public String H() {
      return "minecraft:chest";
   }

   public net.nl.v A(net.r.i var1, net.r.r var2) {
      this.r(var2);
      return new net.nl.a(var1, this, var2);
   }

   protected net.yz.w p() {
      return this.n;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
