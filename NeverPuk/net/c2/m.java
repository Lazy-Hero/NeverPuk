package net.c2;

import java.awt.Color;
import java.io.IOException;
import net.gn;
import net.c2.j;
import net.c2.n;
import net.nl.a;
import net.nl.c;
import net.nl.o;
import net.nl.z1;
import net.yz.m_;

public class m extends n {
   private static final m_ Cj = new m_("textures/gui/container/generic_54.png");
   private final z1 CH;
   public final z1 Cs;
   private final int C3;
   private float Cy;

   public m(z1 var1, z1 var2) {
      super(new a(var1, var2, net.nn.j.b().sf));
      this.CH = var1;
      this.Cs = var2;
      this.E = false;
      boolean var10000 = true;
      var10000 = true;
      this.C3 = var2.e() / 9;
      this.W = 114 + this.C3 * 18;
   }

   public void v(int var1, int var2, float var3) {
      int var4 = j.u.g();
      if(this.A.sf != null && this.A.s8 != null) {
         net.z.t var5 = new net.z.t(net.nn.j.b());
         float var6 = 160.0F;
         int var7 = (int)(var6 / 100.0F);
         if(Float.compare(this.Cy, var6 - (float)var7) < 0) {
            this.Cy += (float)var7;
         }

         if(this.Cy > var6 - (float)var7 && Float.compare(this.Cy, var6) != 0) {
            this.Cy = (float)((int)var6);
         }

         if(this.Cy != var6) {
            this.Cy = (float)((int)var6);
         }

         Color var8 = new Color(gn.M().getRed(), gn.M().getGreen(), gn.M().getBlue(), (int)this.Cy);
         Color var9 = new Color(0, 0, 0, 0);
         this.T(0, 0, (double)var5.u(), (double)var5.v(), var8.getRGB(), var9.getRGB());
      }

      this.C();
      super.v(var1, var2, var3);
      this.X(var1, var2);
   }

   public void L() {
      int var1 = (V - this.W) / 2 + 5;
      this.m.add(new net.z.m(1, q / 2 - 5, var1, 40, 10, "Steal"));
      this.m.add(new net.z.m(2, q / 2 + 40, var1, 40, 10, "Store"));
      super.L();
   }

   public z1 B() {
      return this.Cs;
   }

   protected void t(net.z.m var1) throws IOException {
      super.t(var1);
      if(var1.g == 1) {
         (new Thread(() -> {
            for(int var1 = 0; var1 < this.C3 * 9; ++var1) {
               a var2 = (a)this.A.sf.aG;
               Thread.sleep(50L);
               this.A.sE.K(var2.S, var1, 0, c.QUICK_MOVE, this.A.sf);
            }

         })).start();
      } else if(var1.g == 2) {
         (new Thread(() -> {
            for(int var1 = this.C3 * 9; var1 < this.C3 * 9 + 44; ++var1) {
               o var2 = (o)this.f.e.get(var1);
               if(var2.y() != null) {
                  Thread.sleep(5L);
                  this.Z(var2, var2.d, 0, c.QUICK_MOVE);
               }
            }

         })).start();
      }

   }

   public int p() {
      return this.C3;
   }

   protected void z(int var1, int var2) {
      this.n(this.A.sO, this.Cs.b().l(), 8, 6, -1);
      this.n(this.A.sO, this.CH.b().l(), 8, this.W - 96 + 2, -1);
   }

   protected void j(float var1, int var2, int var3) {
      net.y.d.T(1.0F, 1.0F, 1.0F, 1.0F);
      this.A.n().E(Cj);
      int var4 = (q - this.s) / 2;
      int var5 = (V - this.W) / 2;
      this.g(var4, var5, 0, 0, this.s, this.C3 * 18 + 17);
      this.g(var4, var5 + this.C3 * 18 + 17, 0, 126, this.s, 96);
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
