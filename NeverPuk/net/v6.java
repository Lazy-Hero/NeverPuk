package net;

import com.mojang.realmsclient.gui.ChatFormatting;
import java.awt.Color;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import net.d1;
import net.db;
import net.gn;
import net.mc;
import net.mk;
import net.mr;
import net.o0;
import net.or;
import net.ue;
import net.uy;
import net.xg;
import net.xh;
import net.xn;
import net.c1.c;
import net.c1.y;
import net.n0.e;
import net.n0.ks;
import net.n0.kt;
import net.nb.j;
import net.ne.a;
import net.ne.l;
import net.r.r;
import net.y.d;
import net.yz.k;
import net.z.t;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;

public class v6 extends mk {
   public static Map Q = new HashMap();
   public mc y;
   public mc A;

   public v6() {
      super("NameTags", or.Visuals);
      gn.Q.J.d(new mc("NameTags Size", this, 1.0D, 0.5D, 2.0D, 0.1D));
      gn.Q.J.d(new mc("NameBackground", this, true));
      gn.Q.J.d(this.A = new mc("Border Opacity", this, 10.0D, 0.0D, 255.0D, 5.0D));
      gn.Q.J.d(new mc("OffHand Render", this, true));
      gn.Q.J.d(this.y = new mc("Show Armor", this, true));
   }

   public static net.cb.z F(float var0) {
      return var0 <= 4.0F?net.cb.z.RED:(var0 <= 8.0F?net.cb.z.GOLD:(var0 <= 12.0F?net.cb.z.YELLOW:(var0 <= 16.0F?net.cb.z.DARK_GREEN:net.cb.z.GREEN)));
   }

   @mr
   public void V(ue var1) {
      this.s();
   }

   @mr
   public void B(db var1) {
      j.M();
      d.c();
      Iterator var3 = Q.keySet().iterator();
      if(var3.hasNext()) {
         a var4 = (a)var3.next();
         d.c();
         if(var4 instanceof r && var4 != p.sf) {
            double[] var5 = (double[])Q.get(var4);
            if(var5[3] < 0.0D || var5[3] >= 1.0D) {
               d.Y();
            }

            d.J(var5[0] / (double)t.K(), var5[1] / (double)t.K(), 0.0D);
            this.i();
            String var6 = "";
            if(gn.Q.j.d(d1.class).v() && d1.u.Q()) {
               var6 = "Protected";
            }

            if(gn.Q.z.o(var4.Q())) {
               (new StringBuilder()).append(ChatFormatting.GREEN).append("[F] ").append(ChatFormatting.RESET).append(var4.b().l()).toString();
            }

            var6 = var4.b().l();
            String var7 = "" + o0.T(var4.h(), 1);
            float var8 = (float)(p.sO.r(var7 + " " + var6) + 2);
            d.J(0.0D, -10.0D, 0.0D);
            if(gn.Q.J.S("NameBackground").Q()) {
               xh.T((double)(-var8 / 2.0F), -10.0D, (double)(var8 / 2.0F), 3.0D, 1.0D, xg.m(0, this.A.W()), xg.m(25, this.A.W()), true);
            }

            p.sO.U(var6 + " " + F(var4.h()) + var7, -var8 / 2.0F + 2.0F, -7.5F, -1);
            ks var9 = var4.o(k.OFF_HAND);
            if(this.y.Q()) {
               ArrayList var10 = new ArrayList();
               int var11 = 0;
               ks var12 = ((r)var4).k(var11);
               var10.add(var12);
               ++var11;
               var11 = -(var10.size() * 9);
               if(gn.Q.J.S("OffHand Render").Q()) {
                  p.K().i(var9, var11 + 105 - p.sO.r("" + var11), -29);
                  p.K().q(p.sO, var9, var11 + 105 - p.sO.r("" + var11), -28);
               }

               Iterator var27 = var10.iterator();
               if(var27.hasNext()) {
                  ks var13 = (ks)var27.next();
                  net.y.u1.A();
                  p.K().i(var13, var11 + 6, -28);
                  p.K().q(p.sO, var13, var11 + 5, -26);
                  var11 = var11 + 3;
                  net.y.u1.m();
                  int var14 = 7;
                  int var15 = y.g((c)Objects.requireNonNull(c.R(16)), var13);
                  int var16 = y.g((c)Objects.requireNonNull(c.R(20)), var13);
                  int var17 = y.g((c)Objects.requireNonNull(c.R(19)), var13);
                  if(var15 > 0) {
                     this.Z("S" + this.I(var15) + var15, var11, var14);
                     var14 += 8;
                  }

                  if(var16 > 0) {
                     this.Z("F" + this.I(var16) + var16, var11, var14);
                     var14 += 8;
                  }

                  if(var17 > 0) {
                     this.Z("Kb" + this.I(var17) + var17, var11, var14);
                  }

                  if(var13.Z() instanceof net.n0.j) {
                     int var18 = y.g((c)Objects.requireNonNull(c.R(0)), var13);
                     int var19 = y.g((c)Objects.requireNonNull(c.R(7)), var13);
                     int var20 = y.g((c)Objects.requireNonNull(c.R(34)), var13);
                     if(var18 > 0) {
                        this.Z("P" + this.I(var18) + var18, var11, var14);
                        var14 += 8;
                     }

                     if(var19 > 0) {
                        this.Z("Th" + this.I(var19) + var19, var11, var14);
                        var14 += 8;
                     }

                     if(var20 > 0) {
                        this.Z("U" + this.I(var20) + var20, var11, var14);
                     }
                  }

                  if(var13.Z() instanceof e) {
                     int var28 = y.g((c)Objects.requireNonNull(c.R(48)), var13);
                     int var30 = y.g((c)Objects.requireNonNull(c.R(49)), var13);
                     int var31 = y.g((c)Objects.requireNonNull(c.R(50)), var13);
                     if(var28 > 0) {
                        this.Z("P" + this.I(var28) + var28, var11, var14);
                        var14 += 8;
                     }

                     if(var30 > 0) {
                        this.Z("P" + this.I(var30) + var30, var11, var14);
                        var14 += 8;
                     }

                     if(var31 > 0) {
                        this.Z("F" + this.I(var31) + var31, var11, var14);
                     }
                  }

                  if(var13.p() == kt.EPIC) {
                     this.Z("В§6В§lGod", var11 - 2, var14);
                  }

                  int var29 = (int)Math.round(255.0D - (double)var13.z() * 255.0D / (double)var13.Z());
                  (new Color(255 - var29 << 16 | var29 << 8)).brighter();
                  if(var13.Z() - var13.z() > 0) {
                     d.c();
                     d.z();
                     d.B();
                     d.Y();
                  }

                  var11 = (int)((double)var11 + 13.5D);
               }
            }

            d.Y();
         }
      }

      GL11.glPopMatrix();
      d.C();
   }

   private void Z(String var1, int var2, int var3) {
      d.c();
      d.z();
      var3 = var3 - 7;
      p.sO.U(var1, (float)(var2 + 6), (float)(-35 - var3), -1);
      d.B();
      d.Y();
   }

   private String I(int var1) {
      if(var1 != 1) {
         if(var1 == 2) {
            return "";
         }

         if(var1 == 3) {
            return "";
         }

         if(var1 == 4) {
            return "";
         }

         if(var1 >= 5) {
            return "";
         }
      }

      return "";
   }

   private void s() {
      Q.clear();
      float var1 = p.s9.x;

      for(l var3 : p.s8.J) {
         if(var3 instanceof r && var3 != p.sf) {
            double var4 = var3.hL + (var3.b - var3.hL) * (double)var1 - p.N().h;
            double var6 = var3.F + (var3.hS - var3.F) * (double)var1 - p.N().e;
            double var8 = var3.A + (var3.hr - var3.A) * (double)var1 - p.N().w;
            var6 = var6 + (double)var3.m + 0.2D;
            if(((double[])Objects.requireNonNull(this.F(var4, var6, var8)))[2] >= 0.0D && ((double[])Objects.requireNonNull(this.F(var4, var6, var8)))[2] < 1.0D) {
               Q.put((r)var3, new double[]{((double[])Objects.requireNonNull(this.F(var4, var6, var8)))[0], ((double[])Objects.requireNonNull(this.F(var4, var6, var8)))[1], Math.abs(this.L(var4, var6 + 1.0D, var8, var3)[1] - this.L(var4, var6, var8, var3)[1]), this.F(var4, var6, var8)[2]});
            }
         }
      }

   }

   private double[] L(double var1, double var3, double var5, l var7) {
      float var8 = p.s9.x;
      float var9 = p.sf.hN;
      float var10 = p.sf.hq;
      float[] var11 = uy.Y(var7.hL + (var7.b - var7.hL) * (double)var8, var7.A + (var7.hr - var7.A) * (double)var8, var7.F + (var7.hS - var7.F) * (double)var8 - 1.6D);

      assert p.A() != null;

      p.A().hN = p.A().hq = var11[0];
      p.s4.R(var8, 0);
      double[] var12 = this.F(var1, var3, var5);
      p.A().hN = var9;
      p.A().hq = var10;
      p.s4.R(var8, 0);
      return var12;
   }

   private double[] F(double var1, double var3, double var5) {
      FloatBuffer var7 = BufferUtils.createFloatBuffer(3);
      IntBuffer var8 = BufferUtils.createIntBuffer(16);
      FloatBuffer var9 = BufferUtils.createFloatBuffer(16);
      FloatBuffer var10 = BufferUtils.createFloatBuffer(16);
      GL11.glGetFloat(2982, var9);
      GL11.glGetFloat(2983, var10);
      GL11.glGetInteger(2978, var8);
      boolean var11 = GLU.gluProject((float)var1, (float)var3, (float)var5, var9, var10, var8, var7);
      return new double[]{(double)var7.get(0), (double)((float)Display.getHeight() - var7.get(1)), (double)var7.get(2)};
   }

   private void i() {
      float var1 = p.T.w4?2.0F:gn.Q.J.S("NameTags Size").e();
      d.W(var1, var1, var1);
   }

   private static xn b(xn var0) {
      return var0;
   }
}
