package net.ne;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import net.xn;
import net.ne.a;
import net.ne.d;
import net.ne.l;
import net.yz.ai;
import net.yz.m_;

public class w extends l {
   private static final net.k.v WD = net.k.n.q(w.class, net.k.y.r);
   private static final net.k.v WM = net.k.n.q(w.class, net.k.y.d);
   private static final net.k.v Wi = net.k.n.q(w.class, net.k.y.f);
   private static final net.k.v WP = net.k.n.q(w.class, net.k.y.d);
   private static final net.k.v WN = net.k.n.q(w.class, net.k.y.d);
   private static final net.k.v W3 = net.k.n.q(w.class, net.k.y.d);
   private net.n_.b W7;
   private final List Wc;
   private final Map WA;
   private int Wu;
   private int WL;
   private int We;
   private boolean W0;
   private int W_;
   private float Wl;
   private float Wf;
   private a Wq;
   private UUID Wn;

   public w(net.yv.r var1) {
      super(var1);
      this.W7 = net.nb.w.j;
      this.Wc = Lists.newArrayList();
      this.WA = Maps.newHashMap();
      this.Wu = 600;
      this.WL = 20;
      this.We = 20;
      this.r = true;
      this.hw = true;
      this.h(3.0F);
   }

   public w(net.yv.r var1, double var2, double var4, double var6) {
      this(var1);
      this.t(var2, var4, var6);
   }

   protected void g() {
      this.A().r(WM, Integer.valueOf(0));
      this.A().r(WD, Float.valueOf(0.5F));
      this.A().r(Wi, Boolean.valueOf(false));
      this.A().r(WP, Integer.valueOf(ai.SPELL_MOB.b()));
      this.A().r(WN, Integer.valueOf(0));
      this.A().r(W3, Integer.valueOf(0));
   }

   public void h(float var1) {
      double var2 = this.b;
      double var4 = this.hS;
      double var6 = this.hr;
      this.S(var1 * 2.0F, 0.5F);
      this.t(var2, var4, var6);
      if(!this.hl.x) {
         this.A().d(WD, Float.valueOf(var1));
      }

   }

   public float J() {
      return ((Float)this.A().a(WD)).floatValue();
   }

   public void y(net.n_.b var1) {
      this.W7 = var1;
      if(!this.W0) {
         this.h();
      }

   }

   private void h() {
      if(this.W7 == net.nb.w.j && this.Wc.isEmpty()) {
         this.A().d(WM, Integer.valueOf(0));
      } else {
         this.A().d(WM, Integer.valueOf(net.n_.y.S(net.n_.y.T(this.W7, this.Wc))));
      }

   }

   public void Y(net.n_.i var1) {
      this.Wc.add(var1);
      if(!this.W0) {
         this.h();
      }

   }

   public int l() {
      return ((Integer)this.A().a(WM)).intValue();
   }

   public void Q(int var1) {
      this.W0 = true;
      this.A().d(WM, Integer.valueOf(var1));
   }

   public ai u() {
      return ai.P(((Integer)this.A().a(WP)).intValue());
   }

   public void Q(ai var1) {
      this.A().d(WP, Integer.valueOf(var1.b()));
   }

   public int H() {
      return ((Integer)this.A().a(WN)).intValue();
   }

   public void D(int var1) {
      this.A().d(WN, Integer.valueOf(var1));
   }

   public int d() {
      return ((Integer)this.A().a(W3)).intValue();
   }

   public void Z(int var1) {
      this.A().d(W3, Integer.valueOf(var1));
   }

   protected void Z(boolean var1) {
      this.A().d(Wi, Boolean.valueOf(var1));
   }

   public boolean W() {
      return ((Boolean)this.A().a(Wi)).booleanValue();
   }

   public int c() {
      return this.Wu;
   }

   public void I(int var1) {
      this.Wu = var1;
   }

   public void A() {
      super.A();
      d.p();
      boolean var2 = this.W();
      float var3 = this.J();
      if(this.hl.x) {
         label33: {
            ai var4 = this.u();
            int[] var5 = new int[var4.D()];
            if(var5.length > 0) {
               var5[0] = this.H();
            }

            if(var5.length > 1) {
               var5[1] = this.d();
            }

            if(var2) {
               if(!this.p.nextBoolean()) {
                  break label33;
               }

               int var6 = 0;
               float var7 = this.p.nextFloat() * 6.2831855F;
               float var8 = net.u.t.g(this.p.nextFloat()) * 0.2F;
               float var9 = net.u.t.m(var7) * var8;
               float var10 = net.u.t.A(var7) * var8;
               if(var4 == ai.SPELL_MOB) {
                  int var11 = this.p.nextBoolean()?16777215:this.l();
                  int var12 = var11 >> 16 & 255;
                  int var13 = var11 >> 8 & 255;
                  int var14 = var11 & 255;
                  this.hl.w(ai.SPELL_MOB.b(), this.b + (double)var9, this.hS, this.hr + (double)var10, (double)((float)var12 / 255.0F), (double)((float)var13 / 255.0F), (double)((float)var14 / 255.0F), new int[0]);
               }

               this.hl.w(var4.b(), this.b + (double)var9, this.hS, this.hr + (double)var10, 0.0D, 0.0D, 0.0D, var5);
               ++var6;
            }

            float var22 = 3.1415927F * var3 * var3;
            int var25 = 0;
            if((float)var25 < var22) {
               float var29 = this.p.nextFloat() * 6.2831855F;
               float var32 = net.u.t.g(this.p.nextFloat()) * var3;
               float var34 = net.u.t.m(var29) * var32;
               float var36 = net.u.t.A(var29) * var32;
               if(var4 == ai.SPELL_MOB) {
                  int var37 = this.l();
                  int var39 = var37 >> 16 & 255;
                  int var40 = var37 >> 8 & 255;
                  int var15 = var37 & 255;
                  this.hl.w(ai.SPELL_MOB.b(), this.b + (double)var34, this.hS, this.hr + (double)var36, (double)((float)var39 / 255.0F), (double)((float)var40 / 255.0F), (double)((float)var15 / 255.0F), new int[0]);
               }

               this.hl.w(var4.b(), this.b + (double)var34, this.hS, this.hr + (double)var36, (0.5D - this.p.nextDouble()) * 0.15D, 0.009999999776482582D, (0.5D - this.p.nextDouble()) * 0.15D, var5);
               ++var25;
            }
         }
      }

      if(this.x >= this.WL + this.Wu) {
         this.B();
      } else {
         boolean var19 = this.x < this.WL;
         if(var2 != var19) {
            this.Z(var19);
         }

         if(Float.compare(this.Wf, 0.0F) != 0) {
            var3 += this.Wf;
            if(var3 < 0.5F) {
               this.B();
               return;
            }

            this.h(var3);
         }

         if(this.x % 5 == 0) {
            Iterator var20 = this.WA.entrySet().iterator();
            if(var20.hasNext()) {
               Entry var23 = (Entry)var20.next();
               if(this.x >= ((Integer)var23.getValue()).intValue()) {
                  var20.remove();
               }
            }

            ArrayList var24 = Lists.newArrayList();
            Iterator var27 = this.W7.s().iterator();
            if(var27.hasNext()) {
               net.n_.i var30 = (net.n_.i)var27.next();
               var24.add(new net.n_.i(var30.i(), var30.S() / 4, var30.d(), var30.b(), var30.q()));
            }

            var24.addAll(this.Wc);
            if(var24.isEmpty()) {
               this.WA.clear();
            }

            List var28 = this.hl.p(a.class, this.i());
            if(!var28.isEmpty()) {
               Iterator var31 = var28.iterator();
               if(var31.hasNext()) {
                  a var33 = (a)var31.next();
                  if(!this.WA.containsKey(var33) && var33.U()) {
                     double var35 = var33.b - this.b;
                     double var38 = var33.hr - this.hr;
                     double var41 = var35 * var35 + var38 * var38;
                     if(var41 <= (double)(var3 * var3)) {
                        this.WA.put(var33, Integer.valueOf(this.x + this.We));
                        Iterator var16 = var24.iterator();
                        if(var16.hasNext()) {
                           net.n_.i var17 = (net.n_.i)var16.next();
                           if(var17.i().u()) {
                              var17.i().C(this, this.V(), var33, var17.d(), 0.5D);
                           }

                           var33.o(new net.n_.i(var17));
                        }

                        if(Float.compare(this.Wl, 0.0F) != 0) {
                           var3 = var3 + this.Wl;
                           if(var3 < 0.5F) {
                              this.B();
                              return;
                           }

                           this.h(var3);
                        }

                        if(this.W_ != 0) {
                           this.Wu += this.W_;
                           if(this.Wu <= 0) {
                              this.B();
                              return;
                           }
                        }
                     }
                  }
               }
            }
         }

      }
   }

   public void O(float var1) {
      this.Wl = var1;
   }

   public void C(float var1) {
      this.Wf = var1;
   }

   public void N(int var1) {
      this.WL = var1;
   }

   public void L(@Nullable a var1) {
      this.Wq = var1;
      this.Wn = null;
   }

   @Nullable
   public a V() {
      if(this.Wq == null && this.Wn != null && this.hl instanceof net.yv.d) {
         l var1 = ((net.yv.d)this.hl).O(this.Wn);
         if(var1 instanceof a) {
            this.Wq = (a)var1;
         }
      }

      return this.Wq;
   }

   protected void o(net.nj.f var1) {
      this.x = var1.P("Age");
      this.Wu = var1.P("Duration");
      this.WL = var1.P("WaitTime");
      this.We = var1.P("ReapplicationDelay");
      this.W_ = var1.P("DurationOnUse");
      this.Wl = var1.S("RadiusOnUse");
      this.Wf = var1.S("RadiusPerTick");
      this.h(var1.S("Radius"));
      this.Wn = var1.R("OwnerUUID");
      if(var1.K("Particle", 8)) {
         ai var2 = ai.E(var1.J("Particle"));
         this.Q(var2);
         this.D(var1.P("ParticleParam1"));
         this.Z(var1.P("ParticleParam2"));
      }

      if(var1.K("Color", 99)) {
         this.Q(var1.P("Color"));
      }

      if(var1.K("Potion", 8)) {
         this.y(net.n_.y.N(var1));
      }

      if(var1.K("Effects", 9)) {
         net.nj.h var5 = var1.A("Effects", 10);
         this.Wc.clear();

         for(int var3 = 0; var3 < var5.z(); ++var3) {
            net.n_.i var4 = net.n_.i.s(var5.i(var3));
            this.Y(var4);
         }
      }

   }

   protected void I(net.nj.f var1) {
      var1.r("Age", this.x);
      var1.r("Duration", this.Wu);
      var1.r("WaitTime", this.WL);
      var1.r("ReapplicationDelay", this.We);
      var1.r("DurationOnUse", this.W_);
      var1.d("RadiusOnUse", this.Wl);
      var1.d("RadiusPerTick", this.Wf);
      var1.d("Radius", this.J());
      var1.b("Particle", this.u().T());
      var1.r("ParticleParam1", this.H());
      var1.r("ParticleParam2", this.d());
      if(this.Wn != null) {
         var1.h("OwnerUUID", this.Wn);
      }

      if(this.W0) {
         var1.r("Color", this.l());
      }

      if(this.W7 != net.nb.w.j && this.W7 != null) {
         var1.b("Potion", ((m_)net.n_.b.b.t(this.W7)).toString());
      }

      if(!this.Wc.isEmpty()) {
         net.nj.h var2 = new net.nj.h();

         for(net.n_.i var4 : this.Wc) {
            var2.m(var4.t(new net.nj.f()));
         }

         var1.K("Effects", var2);
      }

   }

   public void O(net.k.v var1) {
      if(WD.equals(var1)) {
         this.h(this.J());
      }

      super.O(var1);
   }

   public net.y1.v J() {
      return net.y1.v.IGNORE;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
