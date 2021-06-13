package net.y1;

import net.xn;
import net.y1.e;
import net.y1.g;
import net.y1.h;
import net.y1.p;
import net.y1.v;
import net.y1.w;

public class l {
   public static final l q = new p(h.d);
   public static final l m = new l(h.m);
   public static final l E = new l(h.W);
   public static final l S = (new l(h.C)).r();
   public static final l z = (new l(h.q)).D();
   public static final l i = (new l(h.TB)).D();
   public static final l Q = (new l(h.TB)).D().k();
   public static final l p = (new g(h.y)).q();
   public static final l U = (new g(h.O)).q();
   public static final l h = (new l(h.G)).r().a().q();
   public static final l u = (new e(h.G)).q();
   public static final l Y = (new e(h.G)).r().q().Q();
   public static final l R = new l(h.Tr);
   public static final l d = (new l(h.U)).r();
   public static final l X = (new p(h.d)).q();
   public static final l Z = new l(h.g);
   public static final l c = (new e(h.d)).q();
   public static final l L = (new e(h.U)).r();
   public static final l y = (new l(h.d)).a().w();
   public static final l A = (new l(h.d)).w();
   public static final l O = (new l(h.O)).r().a();
   public static final l v = (new l(h.G)).q();
   public static final l V = (new l(h.A)).a().w();
   public static final l g = (new l(h.A)).w();
   public static final l C = (new e(h.R)).Q().a().D().q();
   public static final l I = (new l(h.R)).D();
   public static final l B = (new l(h.G)).a().q();
   public static final l N = new l(h.k);
   public static final l H = (new l(h.G)).q();
   public static final l f = (new l(h.G)).q();
   public static final l s = (new w(h.d)).k();
   public static final l l = (new l(h.d)).q();
   public static final l F = (new l(h.U) {
      public boolean f() {
         return false;
      }
   }).D().q();
   public static final l a = (new l(h.q)).k();
   public static final l J = (new l(h.d)).D().k();
   public static final l j = new p(h.d);
   private boolean M;
   private boolean D;
   private boolean o;
   private final h W;
   private boolean n = true;
   private v P = v.NORMAL;
   private boolean k;
   private static String[] K;

   public l(h var1) {
      this.W = var1;
   }

   public boolean y() {
      return false;
   }

   public boolean B() {
      return true;
   }

   public boolean v() {
      return true;
   }

   public boolean f() {
      return true;
   }

   private l a() {
      this.o = true;
      return this;
   }

   protected l D() {
      this.n = false;
      return this;
   }

   protected l r() {
      this.M = true;
      return this;
   }

   public boolean W() {
      return this.M;
   }

   public l Q() {
      this.D = true;
      return this;
   }

   public boolean p() {
      return this.D;
   }

   public boolean V() {
      String var1 = v.u();
      return !this.o && this.f();
   }

   public boolean F() {
      return this.n;
   }

   public v W() {
      return this.P;
   }

   protected l q() {
      this.P = v.DESTROY;
      return this;
   }

   protected l k() {
      this.P = v.BLOCK;
      return this;
   }

   protected l w() {
      this.k = true;
      return this;
   }

   public h f() {
      return this.W;
   }

   static {
      String[] var10000 = new String[1];
      n(var10000);
   }

   public static void n(String[] var0) {
      K = var0;
   }

   public static String[] l() {
      return K;
   }

   private static xn a(xn var0) {
      return var0;
   }
}
