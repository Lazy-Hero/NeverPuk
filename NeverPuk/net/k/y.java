package net.k;

import com.google.common.base.Optional;
import java.io.IOException;
import java.util.UUID;
import javax.annotation.Nullable;
import net.xn;
import net.k.n;
import net.k.s;
import net.k.v;
import net.n0.ks;
import net.n2.h;
import net.u.d;
import net.u.f;
import net.u.j;
import net.y9.l;
import net.yz.aq;
import net.yz.t;

public class y {
   private static final t W = new t(16);
   public static final s g = new s() {
      public void H(h var1, Byte var2) {
         var1.writeByte(var2.byteValue());
      }

      public Byte d(h var1) throws IOException {
         return Byte.valueOf(var1.readByte());
      }

      public v q(int var1) {
         return new v(var1, this);
      }

      public Byte b(Byte var1) {
         return var1;
      }
   };
   public static final s d = new s() {
      public void a(h var1, Integer var2) {
         var1.a(var2.intValue());
      }

      public Integer E(h var1) throws IOException {
         return Integer.valueOf(var1.q());
      }

      public v q(int var1) {
         return new v(var1, this);
      }

      public Integer c(Integer var1) {
         return var1;
      }
   };
   public static final s r = new s() {
      public void R(h var1, Float var2) {
         var1.writeFloat(var2.floatValue());
      }

      public Float F(h var1) throws IOException {
         return Float.valueOf(var1.readFloat());
      }

      public v q(int var1) {
         return new v(var1, this);
      }

      public Float D(Float var1) {
         return var1;
      }
   };
   public static final s J = new s() {
      public void c(h var1, String var2) {
         var1.R(var2);
      }

      public String B(h var1) throws IOException {
         return var1.Z(32767);
      }

      public v q(int var1) {
         return new v(var1, this);
      }

      public String q(String var1) {
         return var1;
      }
   };
   public static final s R = new s() {
      public void T(h var1, net.cb.t var2) {
         var1.p(var2);
      }

      public net.cb.t m(h var1) throws IOException {
         return var1.g();
      }

      public v q(int var1) {
         return new v(var1, this);
      }

      public net.cb.t C(net.cb.t var1) {
         return var1.c();
      }
   };
   public static final s k = new s() {
      public void d(h var1, ks var2) {
         var1.D(var2);
      }

      public ks i(h var1) throws IOException {
         return var1.C();
      }

      public v q(int var1) {
         return new v(var1, this);
      }

      public ks t(ks var1) {
         return var1.s();
      }
   };
   public static final s m = new s() {
      public void s(h var1, Optional var2) {
         String var3 = n.R();
         if(var2.isPresent()) {
            var1.a(l.m((net.yw.n)var2.get()));
         }

         var1.a(0);
      }

      public Optional E(h var1) throws IOException {
         n.R();
         int var3 = var1.q();
         return var3 == 0?Optional.absent():Optional.of(l.P(var3));
      }

      public v q(int var1) {
         return new v(var1, this);
      }

      public Optional n(Optional var1) {
         return var1;
      }

      private static Exception a(Exception var0) {
         return var0;
      }
   };
   public static final s f = new s() {
      public void Q(h var1, Boolean var2) {
         var1.writeBoolean(var2.booleanValue());
      }

      public Boolean H(h var1) throws IOException {
         return Boolean.valueOf(var1.readBoolean());
      }

      public v q(int var1) {
         return new v(var1, this);
      }

      public Boolean g(Boolean var1) {
         return var1;
      }
   };
   public static final s G = new s() {
      public void N(h var1, f var2) {
         n.R();
         var1.writeFloat(var2.D());
         var1.writeFloat(var2.L());
         var1.writeFloat(var2.K());
         if(d.y() == null) {
            n.M("QAhU4b");
         }

      }

      public f G(h var1) throws IOException {
         return new f(var1.readFloat(), var1.readFloat(), var1.readFloat());
      }

      public v q(int var1) {
         return new v(var1, this);
      }

      public f W(f var1) {
         return var1;
      }

      private static xn a(xn var0) {
         return var0;
      }
   };
   public static final s M = new s() {
      public void s(h var1, j var2) {
         var1.B(var2);
      }

      public j l(h var1) throws IOException {
         return var1.S();
      }

      public v q(int var1) {
         return new v(var1, this);
      }

      public j V(j var1) {
         return var1;
      }
   };
   public static final s I = new s() {
      public void x(h var1, Optional var2) {
         String var3 = n.R();
         var1.writeBoolean(var2.isPresent());
         if(var2.isPresent()) {
            var1.B((j)var2.get());
         }

      }

      public Optional Y(h var1) throws IOException {
         String var2 = n.R();
         return !var1.readBoolean()?Optional.absent():Optional.of(var1.S());
      }

      public v q(int var1) {
         return new v(var1, this);
      }

      public Optional J(Optional var1) {
         return var1;
      }

      private static Exception a(Exception var0) {
         return var0;
      }
   };
   public static final s P = new s() {
      public void J(h var1, aq var2) {
         var1.A(var2);
      }

      public aq g(h var1) throws IOException {
         return (aq)var1.S(aq.class);
      }

      public v q(int var1) {
         return new v(var1, this);
      }

      public aq O(aq var1) {
         return var1;
      }
   };
   public static final s e = new s() {
      public void h(h var1, Optional var2) {
         String var3 = n.R();
         var1.writeBoolean(var2.isPresent());
         if(var2.isPresent()) {
            var1.l((UUID)var2.get());
         }

      }

      public Optional R(h var1) throws IOException {
         String var2 = n.R();
         return !var1.readBoolean()?Optional.absent():Optional.of(var1.J());
      }

      public v q(int var1) {
         return new v(var1, this);
      }

      public Optional N(Optional var1) {
         return var1;
      }

      private static Exception a(Exception var0) {
         return var0;
      }
   };
   public static final s n = new s() {
      public void f(h var1, net.nj.f var2) {
         var1.e(var2);
      }

      public net.nj.f E(h var1) throws IOException {
         return var1.A();
      }

      public v q(int var1) {
         return new v(var1, this);
      }

      public net.nj.f j(net.nj.f var1) {
         return var1.F();
      }
   };

   public static void T(s var0) {
      W.J(var0);
   }

   @Nullable
   public static s v(int var0) {
      return (s)W.d(var0);
   }

   public static int p(s var0) {
      return W.w(var0);
   }

   static {
      T(g);
      T(d);
      T(r);
      T(J);
      T(R);
      T(k);
      T(f);
      T(G);
      T(M);
      T(I);
      T(P);
      T(e);
      T(m);
      T(n);
   }
}
