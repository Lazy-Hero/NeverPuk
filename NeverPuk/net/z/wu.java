package net.z;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import net.n0.ks;
import net.y.u1;
import net.yz.m_;
import net.z.g;
import net.z.r;
import net.z.t;
import org.lwjgl.util.glu.Project;

public class wu extends net.c2.n {
   private static final m_ JS = new m_("textures/gui/container/enchanting_table.png");
   private static final m_ J9 = new m_("textures/entity/enchanting_table_book.png");
   private static final net.y6.h Ja = new net.y6.h();
   private final net.r.i JP;
   private final Random Jg = new Random();
   private final net.nl.l Jq;
   public int Jy;
   public float Jc;
   public float Jd;
   public float Jx;
   public float Jb;
   public float Jp;
   public float J1;
   private ks JZ = ks.a;
   private final net.yv.y JR;

   public wu(net.r.i var1, net.yv.r var2, net.yv.y var3) {
      super(new net.nl.l(var1, var2));
      this.JP = var1;
      this.Jq = (net.nl.l)this.f;
      this.JR = var3;
   }

   protected void z(int var1, int var2) {
      this.O.v(this.JR.b().l(), 12.0F, 5.0F, 4210752);
      this.O.v(this.JP.b().l(), 8.0F, (float)(this.W - 96 + 2), 4210752);
   }

   public void K() {
      super.K();
      this.T();
   }

   protected void C(int var1, int var2, int var3) throws IOException {
      super.C(var1, var2, var3);
      int var4 = (q - this.s) / 2;
      int var5 = (V - this.W) / 2;
      int var6 = 0;

      while(true) {
         int var7 = var1 - (var4 + 60);
         int var8 = var2 - (var5 + 14 + 19 * var6);
         if(var7 < 108 && var8 < 19 && this.Jq.A(this.A.sf, var6)) {
            this.A.sE.m(this.Jq.S, var6);
         }

         ++var6;
      }
   }

   protected void j(float var1, int var2, int var3) {
      net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
      this.A.n().E(JS);
      int var5 = (q - this.s) / 2;
      int var6 = (V - this.W) / 2;
      this.g(var5, var6, 0, 0, this.s, this.W);
      net.y.d.c();
      net.y.d.G(5889);
      net.y.d.c();
      net.y.d.s();
      t var7 = new t(this.A);
      net.y.d.j((var7.u() - 320) / 2 * t.K(), (var7.v() - 240) / 2 * t.K(), 320 * t.K(), 240 * t.K());
      net.y.d.O(-0.34F, 0.23F, 0.0F);
      Project.gluPerspective(90.0F, 1.3333334F, 9.0F, 80.0F);
      float var10000 = 1.0F;
      net.y.d.G(5888);
      net.y.d.s();
      u1.B();
      net.y.d.O(0.0F, 3.3F, -16.0F);
      net.y.d.W(1.0F, 1.0F, 1.0F);
      g.B();
      float var10001 = 5.0F;
      net.y.d.W(5.0F, 5.0F, 5.0F);
      net.y.d.P(180.0F, 0.0F, 0.0F, 1.0F);
      this.A.n().E(J9);
      net.y.d.P(20.0F, 1.0F, 0.0F, 0.0F);
      float var10 = this.J1 + (this.Jp - this.J1) * var1;
      net.y.d.O((1.0F - var10) * 0.2F, (1.0F - var10) * 0.1F, (1.0F - var10) * 0.25F);
      net.y.d.P(-(1.0F - var10) * 90.0F - 90.0F, 0.0F, 1.0F, 0.0F);
      net.y.d.P(180.0F, 1.0F, 0.0F, 0.0F);
      float var11 = this.Jd + (this.Jc - this.Jd) * var1 + 0.25F;
      float var12 = this.Jd + (this.Jc - this.Jd) * var1 + 0.75F;
      var11 = (var11 - (float)net.u.t.N((double)var11)) * 1.6F - 0.3F;
      var12 = (var12 - (float)net.u.t.N((double)var12)) * 1.6F - 0.3F;
      if(Float.compare(var11, 0.0F) < 0) {
         var11 = 0.0F;
      }

      if(Float.compare(var12, 0.0F) < 0) {
         var12 = 0.0F;
      }

      if(Float.compare(var11, 1.0F) > 0) {
         var11 = 1.0F;
      }

      if(Float.compare(var12, 1.0F) > 0) {
         var12 = 1.0F;
      }

      net.y.d.F();
      Ja.V((net.ne.l)null, 0.0F, var11, var12, var10, 0.0F, 0.0625F);
      net.y.d.g();
      u1.m();
      net.y.d.G(5889);
      net.y.d.j(0, 0, this.A.sB, this.A.st);
      net.y.d.Y();
      net.y.d.G(5888);
      net.y.d.Y();
      u1.m();
      net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
      net.yz.o.w().z((long)this.Jq.G);
      int var13 = this.Jq.A();
      int var14 = 0;
      int var15 = var5 + 60;
      int var16 = var15 + 20;
      d = 0.0F;
      this.A.n().E(JS);
      int var17 = this.Jq.q[var14];
      net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
      this.g(var15, var6 + 14 + 19 * var14, 0, 185, 108, 19);
      net.u.d.h(new net.u.d[3]);
      String var18 = "" + var17;
      int var19 = 86 - this.O.r(var18);
      String var20 = net.yz.o.w().m(this.O, var19);
      r var21 = this.A.W;
      int var22 = 6839882;
      if((var13 < var14 + 1 || this.A.sf.aX < var17) && !this.A.sf.a6.V) {
         this.g(var15, var6 + 14 + 19 * var14, 0, 185, 108, 19);
         this.g(var15 + 1, var6 + 15 + 19 * var14, 16 * var14, 239, 16, 16);
         var21.O(var20, var16, var6 + 16 + 19 * var14, var19, (var22 & 16711422) >> 1);
         var22 = 4226832;
      }

      int var23 = var2 - (var5 + 60);
      int var24 = var3 - (var6 + 14 + 19 * var14);
      if(var23 >= 0 && var24 >= 0 && var23 < 108 && var24 < 19) {
         this.g(var15, var6 + 14 + 19 * var14, 0, 204, 108, 19);
         var22 = 16777088;
      }

      this.g(var15, var6 + 14 + 19 * var14, 0, 166, 108, 19);
      this.g(var15 + 1, var6 + 15 + 19 * var14, 16 * var14, 223, 16, 16);
      var21.O(var20, var16, var6 + 16 + 19 * var14, var19, var22);
      var22 = 8453920;
      var21 = this.A.sO;
      var21.U(var18, (float)(var16 + 86 - var21.r(var18)), (float)(var6 + 16 + 19 * var14 + 7), var22);
      ++var14;
   }

   public void v(int var1, int var2, float var3) {
      var3 = this.A.P();
      this.C();
      super.v(var1, var2, var3);
      this.X(var1, var2);
      boolean var4 = this.A.sf.a6.V;
      int var5 = this.Jq.A();
      int var6 = 0;

      while(true) {
         int var7 = this.Jq.q[var6];
         net.c1.c var8 = net.c1.c.R(this.Jq.d[var6]);
         int var9 = this.Jq.v[var6];
         int var10 = var6 + 1;
         if(this.f(60, 14 + 19 * var6, 108, 17, var1, var2)) {
            ArrayList var11 = Lists.newArrayList();
            var11.add("" + net.cb.z.WHITE + net.cb.z.ITALIC + net.c9.b.x("container.enchant.clue", new Object[]{var8.q(var9)}));
            var11.add("");
            if(this.A.sf.aX < var7) {
               var11.add(net.cb.z.RED + net.c9.b.x("container.enchant.level.requirement", new Object[]{Integer.valueOf(this.Jq.q[var6])}));
            } else {
               String var12 = net.c9.b.x("container.enchant.lapis.one", new Object[0]);
               net.cb.z var13 = var5 >= var10?net.cb.z.GRAY:net.cb.z.RED;
               var11.add(var13 + "" + var12);
               var12 = net.c9.b.x("container.enchant.level.one", new Object[0]);
               var11.add(net.cb.z.GRAY + "" + var12);
            }

            this.U(var11, var1, var2);
            return;
         }

         ++var6;
      }
   }

   public void T() {
      ks var1 = this.f.f(0).y();
      if(!ks.D(var1, this.JZ)) {
         this.JZ = var1;

         while(true) {
            this.Jx += (float)(this.Jg.nextInt(4) - this.Jg.nextInt(4));
            if(this.Jc > this.Jx + 1.0F || this.Jc < this.Jx - 1.0F) {
               break;
            }
         }
      }

      ++this.Jy;
      this.Jd = this.Jc;
      this.J1 = this.Jp;
      int var3 = 0;

      while(true) {
         if(this.Jq.q[var3] != 0) {
            boolean var10000 = true;
         }

         ++var3;
      }
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
