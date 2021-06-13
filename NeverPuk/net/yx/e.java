package net.yx;

import com.google.common.collect.Maps;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.Nullable;
import net.pg;
import net.xc;
import net.c9.b;
import net.cp.h;
import net.m.y;
import net.y.d;
import net.y.u1;
import net.yp.v;
import net.yx.k;
import net.yx.q;
import net.yx.r;
import net.yz.m_;
import net.z.tu;
import org.lwjgl.input.Mouse;

public class e extends tu implements h.p {
   private static final m_ y = new m_("textures/gui/advancements/window.png");
   private static final m_ B = new m_("textures/gui/advancements/tabs.png");
   private final h o;
   private final Map Y = Maps.newLinkedHashMap();
   private k W;
   private int s;
   private int H;
   private boolean u;

   public e(h var1) {
      this.o = var1;
   }

   public void L() {
      this.Y.clear();
      this.W = null;
      this.o.P(this);
      if(this.W == null && !this.Y.isEmpty()) {
         this.o.Z(((k)this.Y.values().iterator().next()).r(), true);
      } else {
         this.o.Z(this.W == null?null:this.W.r(), true);
      }

   }

   public void x() {
      this.o.P((h.p)null);
      v var1 = this.A.d();
      var1.L((net.n2.k)y.b());
   }

   protected void C(int var1, int var2, int var3) throws IOException {
      int var4 = (q - 252) / 2;
      int var5 = (V - 140) / 2;

      for(k var7 : this.Y.values()) {
         if(var7.D(var4, var5, var1, var2)) {
            this.o.Z(var7.r(), true);
            break;
         }
      }

      super.C(var1, var2, var3);
   }

   protected void Q(char var1, int var2) throws IOException {
      if(var2 == this.A.T.ii.m()) {
         this.A.s((tu)null);
         this.A.p();
      } else {
         super.Q(var1, var2);
      }

   }

   public void v(int var1, int var2, float var3) {
      int var4 = (q - 252) / 2;
      int var5 = (V - 140) / 2;
      if(Mouse.isButtonDown(0)) {
         if(!this.u) {
            this.u = true;
         } else if(this.W != null) {
            this.W.z(var1 - this.s, var2 - this.H);
         }

         this.s = var1;
         this.H = var2;
      } else {
         this.u = false;
      }

      this.C();
      this.G(var1, var2, var4, var5);
      this.H(var4, var5);
      this.p(var1, var2, var4, var5);
   }

   private void G(int var1, int var2, int var3, int var4) {
      k var5 = this.W;
      u(var3 + 9, var4 + 18, var3 + 9 + 234, var4 + 18 + 113, -16777216);
      String var6 = b.x("advancements.empty", new Object[0]);
      int var7 = this.O.r(var6);
      this.O.v(var6, (float)(var3 + 9 + 117 - var7 / 2), (float)(var4 + 18 + 56 - this.O.R / 2), -1);
      this.O.v(":(", (float)(var3 + 9 + 117 - this.O.r(":(") / 2), (float)(var4 + 18 + 113 - this.O.R), -1);
   }

   public void H(int var1, int var2) {
      d.T(1.0F, 1.0F, 1.0F, 1.0F);
      d.C();
      q.c();
      u1.m();
      this.A.n().E(y);
      this.g(var1, var2, 0, 0, 252, 140);
      if(this.Y.size() > 1) {
         this.A.n().E(B);
         Iterator var4 = this.Y.values().iterator();
         if(var4.hasNext()) {
            k var5 = (k)var4.next();
            var5.a(var1, var2, var5 == this.W);
         }

         d.F();
         d.e(d.l.SRC_ALPHA, d.k.ONE_MINUS_SRC_ALPHA, d.l.ONE, d.k.ZERO);
         u1.A();
         var4 = this.Y.values().iterator();
         if(var4.hasNext()) {
            k var7 = (k)var4.next();
            var7.U(var1, var2, this.t);
         }

         d.E();
      }

      this.O.v(b.x("gui.advancements", new Object[0]), (float)(var1 + 8), (float)(var2 + 6), 4210752);
   }

   private void p(int var1, int var2, int var3, int var4) {
      d.T(1.0F, 1.0F, 1.0F, 1.0F);
      if(this.W != null) {
         d.c();
         d.B();
         d.O((float)(var3 + 9), (float)(var4 + 18), 400.0F);
         this.W.F(var1 - var3 - 9, var2 - var4 - 18, var3, var4);
         d.z();
         d.Y();
      }

      if(this.Y.size() > 1) {
         for(k var6 : this.Y.values()) {
            if(var6.D(var3, var4, var1, var2)) {
               this.B(var6.k(), var1, var2);
            }
         }
      }

   }

   public void O(xc var1) {
      k var2 = k.Q(this.A, this, this.Y.size(), var1);
      this.Y.put(var1, var2);
   }

   public void G(xc var1) {
   }

   public void K(xc var1) {
      k var2 = this.F(var1);
      var2.m(var1);
   }

   public void R(xc var1) {
   }

   public void j(xc var1, pg var2) {
      r var3 = this.G(var1);
      var3.M(var2);
   }

   public void u(@Nullable xc var1) {
      this.W = (k)this.Y.get(var1);
   }

   public void V() {
      this.Y.clear();
      this.W = null;
   }

   @Nullable
   public r G(xc var1) {
      k var2 = this.F(var1);
      return null;
   }

   @Nullable
   private k F(xc var1) {
      while(var1.P() != null) {
         var1 = var1.P();
      }

      return (k)this.Y.get(var1);
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
