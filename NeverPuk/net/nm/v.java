package net.nm;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import javax.annotation.Nullable;
import net.xn;
import net.k.y;
import net.n0.ks;
import net.nm.w;
import net.y9.r1;
import net.y9.r8;
import net.yz.aq;
import net.yz.m_;

public class v extends net.ne.l {
   private net.yw.n zN;
   public int zL;
   public boolean zT = true;
   private boolean zC;
   private boolean zu;
   private int zt = 40;
   private float z7 = 2.0F;
   public net.nj.f z4;
   protected static final net.k.v zp = net.k.n.q(v.class, y.M);

   public v(net.yv.r var1) {
      super(var1);
   }

   public v(net.yv.r var1, double var2, double var4, double var6, net.yw.n var8) {
      super(var1);
      this.zN = var8;
      this.a = true;
      this.S(0.98F, 0.98F);
      this.t(var2, var4 + (double)((1.0F - this.m) / 2.0F), var6);
      this.hf = 0.0D;
      this.K = 0.0D;
      this.J = 0.0D;
      this.h = var2;
      this.h6 = var4;
      this.l = var6;
      this.r(new net.u.j(this));
   }

   public boolean C() {
      return false;
   }

   public void r(net.u.j var1) {
      this.G.d(zp, var1);
   }

   public net.u.j T() {
      return (net.u.j)this.G.a(zp);
   }

   protected boolean k() {
      return false;
   }

   protected void g() {
      this.G.r(zp, net.u.j.V);
   }

   public boolean w() {
      return !this.Z;
   }

   public void A() {
      w.h.s();
      net.y9.l var2 = this.zN.Q();
      if(this.zN.n() == net.y1.l.q) {
         this.B();
      }

      this.h = this.b;
      this.h6 = this.hS;
      this.l = this.hr;
      if(this.zL++ == 0) {
         net.u.j var3 = new net.u.j(this);
         if(this.hl.Z(var3).Q() == var2) {
            this.hl.J(var3);
         }

         if(!this.hl.x) {
            this.B();
            return;
         }
      }

      if(!this.j()) {
         this.K -= 0.03999999910593033D;
      }

      this.N(net.ne.f.SELF, this.hf, this.K, this.J);
      if(!this.hl.x) {
         label279: {
            net.u.j var14 = new net.u.j(this);
            boolean var4 = this.zN.Q() == net.nb.f.db;
            boolean var5 = this.hl.Z(var14).n() == net.y1.l.p;
            double var15 = this.hf * this.hf + this.K * this.K + this.J * this.J;
            if(!this.k) {
               if((this.zL <= 100 || this.hl.x || var14.h() >= 1 && var14.h() <= 256) && this.zL <= 600) {
                  break label279;
               }

               if(this.zT && this.hl.N().b("doEntityDrops")) {
                  this.O(new ks(var2, 1, var2.z(this.zN)), 0.0F);
               }

               this.B();
            }

            net.yw.n var8 = this.hl.Z(var14);
            if(r1.T(this.hl.Z(new net.u.j(this.b, this.hS - 0.009999999776482582D, this.hr)))) {
               this.k = false;
               return;
            }

            this.hf *= 0.699999988079071D;
            this.J *= 0.699999988079071D;
            this.K *= -0.5D;
            if(var8.Q() != net.nb.f.dK) {
               label624: {
                  this.B();
                  if(!this.zC) {
                     if(this.hl.j(var2, var14, true, aq.UP, (net.ne.l)null) && !r1.T(this.hl.Z(var14.b())) && this.hl.k(var14, this.zN, 3)) {
                        if(var2 instanceof r1) {
                           ((r1)var2).N(this.hl, var14, this.zN, var8);
                        }

                        if(this.z4 == null || !(var2 instanceof net.y9.r)) {
                           break label624;
                        }

                        net.ni.v var9 = this.hl.L(var14);
                        if(var9 != null) {
                           net.nj.f var10 = var9.b(new net.nj.f());
                           Iterator var11 = this.z4.b().iterator();
                           if(var11.hasNext()) {
                              String var12 = (String)var11.next();
                              net.nj.q var13 = this.z4.m(var12);
                              if(!"x".equals(var12) && !"y".equals(var12) && !"z".equals(var12)) {
                                 var10.K(var12, var13.v());
                              }
                           }

                           var9.G(var10);
                           var9.W();
                        }
                     }

                     if(!this.zT || !this.hl.N().b("doEntityDrops")) {
                        break label624;
                     }

                     this.O(new ks(var2, 1, var2.z(this.zN)), 0.0F);
                  }

                  if(var2 instanceof r1) {
                     ((r1)var2).j(this.hl, var14);
                  }
               }
            }
         }
      }

      this.hf *= 0.9800000190734863D;
      this.K *= 0.9800000190734863D;
      this.J *= 0.9800000190734863D;
   }

   public void v(float var1, float var2) {
      net.y9.l var3 = this.zN.Q();
      if(this.zu) {
         int var4 = net.u.t.Y(var1 - 1.0F);
         ArrayList var5 = Lists.newArrayList(this.hl.u(this, this.i()));
         boolean var6 = var3 == net.nb.f.uc;
         net.yz.z var7 = net.yz.z.J;

         for(net.ne.l var9 : var5) {
            var9.H(var7, (float)Math.min(net.u.t.M((float)var4 * this.z7), this.zt));
         }

         if((double)this.p.nextFloat() < 0.05000000074505806D + (double)var4 * 0.05D) {
            int var10 = ((Integer)this.zN.i(r8.F)).intValue();
            ++var10;
            if(var10 > 2) {
               this.zC = true;
            } else {
               this.zN = this.zN.s(r8.F, Integer.valueOf(var10));
            }
         }
      }

   }

   public static void g(net.c0.d var0) {
   }

   protected void I(net.nj.f var1) {
      net.y9.l var2 = this.zN != null?this.zN.Q():net.nb.f.ou;
      m_ var3 = (m_)net.y9.l.m.t(var2);
      var1.b("Block", "");
      var1.D("Data", (byte)var2.d(this.zN));
      var1.r("Time", this.zL);
      var1.c("DropItem", this.zT);
      var1.c("HurtEntities", this.zu);
      var1.d("FallHurtAmount", this.z7);
      var1.r("FallHurtMax", this.zt);
      if(this.z4 != null) {
         var1.K("TileEntityData", this.z4);
      }

   }

   protected void o(net.nj.f var1) {
      int var2 = var1.R("Data") & 255;
      if(var1.K("Block", 8)) {
         this.zN = net.y9.l.d(var1.J("Block")).D(var2);
      } else if(var1.K("TileID", 99)) {
         this.zN = net.y9.l.I(var1.P("TileID")).D(var2);
      } else {
         this.zN = net.y9.l.I(var1.R("Tile") & 255).D(var2);
      }

      this.zL = var1.P("Time");
      net.y9.l var3 = this.zN.Q();
      if(var1.K("HurtEntities", 99)) {
         this.zu = var1.i("HurtEntities");
         this.z7 = var1.S("FallHurtAmount");
         this.zt = var1.P("FallHurtMax");
      } else if(var3 == net.nb.f.uc) {
         this.zu = true;
      }

      if(var1.K("DropItem", 99)) {
         this.zT = var1.i("DropItem");
      }

      if(var1.K("TileEntityData", 10)) {
         this.z4 = var1.o("TileEntityData");
      }

      if(var3.p().n() == net.y1.l.q) {
         this.zN = net.nb.f.TF.p();
      }

   }

   public net.yv.r c() {
      return this.hl;
   }

   public void x(boolean var1) {
      this.zu = var1;
   }

   public boolean G() {
      return false;
   }

   public void x(net.d.l var1) {
      super.x(var1);
      if(this.zN != null) {
         net.y9.l var2 = this.zN.Q();
         var1.e("Immitating block ID", Integer.valueOf(net.y9.l.h(var2)));
         var1.e("Immitating block data", Integer.valueOf(var2.d(this.zN)));
      }

   }

   @Nullable
   public net.yw.n t() {
      return this.zN;
   }

   public boolean O() {
      return true;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
