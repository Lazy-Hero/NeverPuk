package net.y2;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import net.xn;
import net.c9.p;
import net.nn.j;
import net.y.d;
import net.y2.m;
import net.y2.t;
import net.y8.x;
import org.lwjgl.util.vector.Matrix4f;

public class b {
   private final m A;
   public final t D;
   public final t o;
   private final List Y = Lists.newArrayList();
   private final List S = Lists.newArrayList();
   private final List K = Lists.newArrayList();
   private final List P = Lists.newArrayList();
   private Matrix4f C;

   public b(p var1, String var2, t var3, t var4) throws IOException {
      this.A = new m(var1, var2);
      this.D = var3;
      this.o = var4;
   }

   public void K() {
      this.A.I();
   }

   public void X(String var1, Object var2, int var3, int var4) {
      this.S.add(this.S.size(), var1);
      this.Y.add(this.Y.size(), var2);
      this.K.add(this.K.size(), Integer.valueOf(var3));
      this.P.add(this.P.size(), Integer.valueOf(var4));
   }

   private void E() {
      d.T(1.0F, 1.0F, 1.0F, 1.0F);
      d.E();
      d.z();
      d.d();
      d.V();
      d.i();
      d.e();
      d.S();
      d.z(0);
   }

   public void M(Matrix4f var1) {
      this.C = var1;
   }

   public void C(float var1) {
      t.h();
      this.E();
      this.D.B();
      float var3 = (float)this.o.A;
      float var4 = (float)this.o.m;
      d.j(0, 0, (int)var3, (int)var4);
      this.A.P("DiffuseSampler", this.D);
      int var5 = 0;
      if(var5 < this.Y.size()) {
         this.A.P((String)this.S.get(var5), this.Y.get(var5));
         this.A.g("AuxSize" + var5).T((float)((Integer)this.K.get(var5)).intValue(), (float)((Integer)this.P.get(var5)).intValue());
         ++var5;
         net.u.d.h(new net.u.d[3]);
      }

      this.A.g("ProjMat").z(this.C);
      this.A.g("InSize").T((float)this.D.A, (float)this.D.m);
      this.A.g("OutSize").T(var3, var4);
      this.A.g("Time").a(var1);
      j var11 = j.b();
      this.A.g("ScreenSize").T((float)var11.sB, (float)var11.st);
      this.A.y();
      this.o.r();
      this.o.U(false);
      d.Y(false);
      d.q(true, true, true, true);
      net.y.r var6 = net.y.r.f();
      net.y.p var7 = var6.k();
      var7.m(7, x.F);
      var7.H(0.0D, (double)var4, 500.0D).V(255, 255, 255, 255).W();
      var7.H((double)var3, (double)var4, 500.0D).V(255, 255, 255, 255).W();
      var7.H((double)var3, 0.0D, 500.0D).V(255, 255, 255, 255).W();
      var7.H(0.0D, 0.0D, 500.0D).V(255, 255, 255, 255).W();
      var6.p();
      d.Y(true);
      d.q(true, true, true, true);
      this.A.s();
      this.o.B();
      this.D.T();
      Iterator var8 = this.Y.iterator();
      if(var8.hasNext()) {
         Object var9 = var8.next();
         if(var9 instanceof t) {
            ((t)var9).T();
         }
      }

   }

   public m y() {
      return this.A;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
