package net;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import net._f;
import net.mf;
import net.o3;
import net.xn;
import net.z9;
import net.u.j;
import net.y.b;
import net.y.w;
import net.ym.t;
import net.yw.l;
import net.yw.n;
import net.yz.ac;
import net.yz.aq;

public class _c {
   private net.yv.o8 z;
   private n t;
   private j b;
   private int d = -1;
   private int s = -1;
   private int v = -1;
   private int E = -1;
   private final float[] G = new float[aq.VALUES.length * 2];
   private final BitSet U = new BitSet(3);
   private final w.c p = new w.c();
   private _f f = null;
   private boolean[] h = null;
   private boolean[] l = null;
   private boolean[] e = null;
   private aq[] M = null;
   private final List y = new ArrayList();
   private final List V = new ArrayList();
   private final t[] H = new t[1];
   private final t[] u = new t[2];
   private final t[] a = new t[3];
   private final t[] Q = new t[4];
   private b Z = null;
   private final o3[] o = new o3[ac.values().length];
   private boolean J = false;
   private static final int R = -1;
   private static final int F = 0;
   private static final int O = 1;

   public _c(net.yv.o8 var1, n var2, j var3) {
      this.z = var1;
      this.t = var2;
      this.b = var3;
   }

   public void S(net.yv.o8 var1, n var2, j var3) {
      String var4 = mf.O();
      if(this.z != var1 || this.t != var2 || this.b != var3) {
         this.z = var1;
         this.t = var2;
         this.b = var3;
         this.d = -1;
         this.s = -1;
         this.v = -1;
         this.E = -1;
         this.U.clear();
      }

   }

   public int D() {
      if(this.d < 0) {
         if(this.t instanceof l) {
            l var1 = (l)this.t;
            this.d = var1.z();
         } else {
            this.d = net.y9.l.h(this.t.Q());
         }
      }

      return this.d;
   }

   public int h() {
      if(this.s < 0) {
         if(this.t instanceof l) {
            l var1 = (l)this.t;
            this.s = var1.Q();
         } else {
            this.s = this.t.Q().d(this.t);
         }
      }

      return this.s;
   }

   public float[] p() {
      return this.G;
   }

   public BitSet O() {
      return this.U;
   }

   public w.c H() {
      return this.p;
   }

   public boolean b(List var1) {
      if(this.v == -1 && var1.size() > 0) {
         if(var1.get(0) instanceof net.ym.n) {
            this.v = 1;
         } else {
            this.v = 0;
         }
      }

      return this.v == 1;
   }

   public boolean W(t var1) {
      if(this.v < 0) {
         if(var1 instanceof net.ym.n) {
            this.v = 1;
         } else {
            this.v = 0;
         }
      }

      return this.v == 1;
   }

   public boolean X() {
      return this.v == 1;
   }

   public n P() {
      return this.t;
   }

   public _f L() {
      if(this.f == null) {
         this.f = new _f(0, 0, 0);
      }

      return this.f;
   }

   public boolean[] U() {
      if(this.h == null) {
         this.h = new boolean[4];
      }

      return this.h;
   }

   public boolean[] X() {
      if(this.l == null) {
         this.l = new boolean[4];
      }

      return this.l;
   }

   public boolean[] i() {
      if(this.e == null) {
         this.e = new boolean[4];
      }

      return this.e;
   }

   public aq[] c() {
      if(this.M == null) {
         this.M = new aq[4];
      }

      return this.M;
   }

   public aq[] b(aq var1, aq var2, aq var3, aq var4) {
      aq[] var5 = this.c();
      var5[0] = var1;
      var5[1] = var2;
      var5[2] = var3;
      var5[3] = var4;
      return var5;
   }

   public boolean E() {
      if(this.E == -1) {
         if(z9.x() && this.t.Q() instanceof net.y9.gh) {
            this.E = 1;
         } else {
            this.E = 0;
         }
      }

      return this.E == 1;
   }

   public List T() {
      return this.y;
   }

   public t[] u(t var1) {
      this.H[0] = var1;
      return this.H;
   }

   public t[] s(t var1, t var2) {
      this.u[0] = var1;
      this.u[1] = var2;
      return this.u;
   }

   public t[] r(t var1, t var2, t var3) {
      this.a[0] = var1;
      this.a[1] = var2;
      this.a[2] = var3;
      return this.a;
   }

   public t[] O(t var1, t var2, t var3, t var4) {
      this.Q[0] = var1;
      this.Q[1] = var2;
      this.Q[2] = var3;
      this.Q[3] = var4;
      return this.Q;
   }

   public List I(t[] var1) {
      this.V.clear();

      for(int var2 = 0; var2 < var1.length; ++var2) {
         t var3 = var1[var2];
         this.V.add(var3);
      }

      return this.V;
   }

   public b s() {
      return this.Z;
   }

   public void P(b var1) {
      this.Z = var1;
   }

   public o3 Q(ac var1) {
      o3 var2 = this.o[var1.ordinal()];
      var2 = new o3();
      this.o[var1.ordinal()] = var2;
      return var2;
   }

   public boolean L() {
      return this.J;
   }

   public void n(boolean var1) {
      this.J = var1;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
