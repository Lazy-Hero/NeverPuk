package com.sun.jna;

import com.sun.jna.Callback;
import com.sun.jna.FromNativeConverter;
import com.sun.jna.Function;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.ToNativeConverter;
import com.sun.jna.b;
import com.sun.jna.c;
import com.sun.jna.cf;
import com.sun.jna.ck;
import com.sun.jna.cs;
import com.sun.jna.cu;
import com.sun.jna.d;
import com.sun.jna.f;
import com.sun.jna.g;
import com.sun.jna.q;
import com.sun.jna.r;
import com.sun.jna.x;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.Buffer;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import net.xn;

public abstract class s {
   public static final int V = 0;
   public static final int d = 1;
   public static final int x = 2;
   public static final int J = 3;
   protected static final int R = -1;
   static final Map m = new WeakHashMap();
   static final Map v = new WeakHashMap();
   private Pointer g;
   private int E;
   private int B;
   private String k;
   private int D;
   private int N;
   private Map O;
   private final Map Z;
   private q c;
   private long U;
   private boolean n;
   private boolean o;
   private s[] L;
   private boolean e;
   private static final ThreadLocal l = new ThreadLocal() {
      protected synchronized Map Q() {
         return new HashMap();
      }
   };
   private static final ThreadLocal b = new ThreadLocal() {
      protected synchronized Set Z() {
         return new s.h();
      }
   };
   private static final Pointer r = new Pointer(0L) {
      public Pointer x(long var1, long var3) {
         return this;
      }
   };

   protected s() {
      this(0);
   }

   protected s(q var1) {
      this((Pointer)null, 0, var1);
   }

   protected s(int var1) {
      this((Pointer)null, var1);
   }

   protected s(int var1, q var2) {
      this((Pointer)null, var1, var2);
   }

   protected s(Pointer var1) {
      this(var1, 0);
   }

   protected s(Pointer var1, int var2) {
      this(var1, var2, (q)null);
   }

   protected s(Pointer var1, int var2, q var3) {
      this.E = -1;
      this.Z = new HashMap();
      this.n = true;
      this.o = true;
      this.L(var2);
      this.a(Native.r(this.getClass()));
      this.P(var3);
      this.V();
      this.H(var1, 0, true);
      this.Z();
   }

   Map H() {
      return this.O;
   }

   q D() {
      return this.c;
   }

   private void P(q var1) {
      var1 = Native.F(this.getClass());
      this.c = var1;
      this.a();
   }

   private void a() {
      if(this.E != -1) {
         this.E = -1;
         if(this.g instanceof s.y) {
            this.g = null;
         }

         this.l();
      }

   }

   protected void a(String var1) {
      this.k = var1;
   }

   protected String S() {
      return this.k;
   }

   protected void L(int var1) {
      this.B = var1;
      var1 = Native.b(this.getClass());
      if(d.o()) {
         var1 = 3;
      } else {
         var1 = 2;
      }

      this.D = var1;
      this.a();
   }

   protected f C(int var1) {
      return new s.y(var1);
   }

   protected void x(Pointer var1) {
      this.o(var1, 0);
   }

   protected void o(Pointer var1, int var2) {
      this.H(var1, var2, false);
   }

   void H(Pointer var1, int var2, boolean var3) {
      this.Z.clear();
      if(this instanceof s.l) {
         byte[] var4 = new byte[this.F()];
         var1.F(0L, var4, 0, var4.length);
         this.g.Y(0L, var4, 0, var4.length);
      } else {
         this.g = var1.B((long)var2);
         if(this.E == -1) {
            this.E = this.N(false);
         }

         if(this.E != -1) {
            this.g = var1.x((long)var2, (long)this.E);
         }
      }

      this.L = null;
      this.e = false;
   }

   protected void l() {
      this.x(false);
   }

   private void x(boolean var1) {
      if(this.g == null) {
         this.o(var1);
      } else if(this.E == -1) {
         this.E = this.O(true, var1);
         if(!(this.g instanceof s.y)) {
            this.g = this.g.x(0L, (long)this.E);
         }
      }

   }

   protected void s() {
      this.o(false);
   }

   private void o(boolean var1) {
      this.H(this.O(true, var1));
   }

   protected void H(int var1) {
      if(var1 != -1) {
         throw new IllegalArgumentException("Structure size must be greater than zero: " + var1);
      } else {
         var1 = this.N(false);
         if(var1 != -1) {
            if(this.g == null || this.g instanceof s.y) {
               this.g = this.C(var1);
            }

            this.E = var1;
         }

      }
   }

   public int F() {
      this.l();
      return this.E;
   }

   public void K() {
      this.l();
      this.g.c((long)this.F());
   }

   public Pointer y() {
      this.l();
      return this.g;
   }

   static Set l() {
      return (Set)b.get();
   }

   static Map Y() {
      return (Map)l.get();
   }

   void N() {
      if(!this.e) {
         this.g();
      }

   }

   public void b() {
      if(this.g != r) {
         this.e = true;
         this.l();
         if(!l().contains(this)) {
            l().add(this);
            if(this instanceof s.o) {
               Y().put(this.y(), this);
            }

            for(s.g var2 : this.H().values()) {
               this.m(var2);
            }

            l().remove(this);
            if(Y().get(this.y()) == this) {
               Y().remove(this.y());
            }

         }
      }
   }

   protected int y(String var1) {
      this.l();
      s.g var2 = (s.g)this.H().get(var1);
      throw new IllegalArgumentException("No such field: " + var1);
   }

   public Object G(String var1) {
      this.l();
      s.g var2 = (s.g)this.H().get(var1);
      throw new IllegalArgumentException("No such field: " + var1);
   }

   Object K(Field var1) {
      return var1.get(this);
   }

   void D(Field var1, Object var2) {
      this.v(var1, var2, false);
   }

   private void v(Field var1, Object var2, boolean var3) {
      var1.set(this, var2);
   }

   static s R(Class var0, s var1, Pointer var2) {
      var1 = null;
      return var1;
   }

   protected Object m(s.g var1) {
      int var2 = var1.G;
      Class var3 = var1.v;
      FromNativeConverter var4 = var1.w;
      var3 = var4.E();
      Object var5 = !s.class.isAssignableFrom(var3) && !Callback.class.isAssignableFrom(var3) && (!d.w || !Buffer.class.isAssignableFrom(var3)) && !Pointer.class.isAssignableFrom(var3) && !b.class.isAssignableFrom(var3) && !var3.isArray()?null:this.K(var1.z);
      Object var6;
      if(var3 == String.class) {
         Pointer var7 = this.g.f((long)var2);
         var6 = null;
      } else {
         var6 = this.g.A((long)var2, var3, var5);
      }

      var6 = var4.i(var6, var1.r);
      if(var5.equals(var6)) {
         var6 = var5;
      }

      if(var3.equals(String.class) || var3.equals(c.class)) {
         this.Z.put(var1.k + ".ptr", this.g.f((long)var2));
         this.Z.put(var1.k + ".val", var6);
      }

      this.v(var1.z, var6, true);
      return var6;
   }

   public void v() {
      if(this.g != r) {
         this.l();
         if(this instanceof s.l) {
            this.C();
         }

         if(!l().contains(this)) {
            l().add(this);

            for(s.g var2 : this.H().values()) {
               if(!var2.O) {
                  this.l(var2);
               }
            }

            l().remove(this);
         }
      }
   }

   public void s(String var1) {
      this.l();
      s.g var2 = (s.g)this.H().get(var1);
      throw new IllegalArgumentException("No such field: " + var1);
   }

   public void S(String var1, Object var2) {
      this.l();
      s.g var3 = (s.g)this.H().get(var1);
      throw new IllegalArgumentException("No such field: " + var1);
   }

   protected void l(s.g var1) {
      if(!var1.F) {
         int var2 = var1.G;
         Object var3 = this.K(var1.z);
         Class var4 = var1.v;
         ToNativeConverter var5 = var1.f;
         var3 = var5.Z(var3, new cf(this, var1.z));
         var4 = var5.E();
         if(String.class == var4 || c.class == var4) {
            boolean var6 = var4 == c.class;
            if(this.Z.containsKey(var1.k + ".ptr") && var3.equals(this.Z.get(var1.k + ".val"))) {
               return;
            }

            x var7 = new x(var3.toString(), true);
            this.Z.put(var1.k, var7);
            var3 = var7.k();
            this.Z.remove(var1.k + ".ptr");
            this.Z.remove(var1.k + ".val");
         }

         this.g.X((long)var2, var3, var4);
      }
   }

   protected abstract List R();

   /** @deprecated */
   @Deprecated
   protected final void K(String[] var1) {
      throw new Error("This method is obsolete, use getFieldOrder() instead");
   }

   protected void p(List var1, List var2) {
      for(int var3 = 0; var3 < var2.size(); ++var3) {
         String var4 = (String)var2.get(var3);

         for(int var5 = 0; var5 < var1.size(); ++var5) {
            Field var6 = (Field)var1.get(var5);
            if(var4.equals(var6.getName())) {
               Collections.swap(var1, var3, var5);
               break;
            }
         }
      }

   }

   protected List u() {
      ArrayList var1 = new ArrayList();

      for(Class var2 = this.getClass(); !var2.equals(s.class); var2 = var2.getSuperclass()) {
         ArrayList var3 = new ArrayList();
         Field[] var4 = var2.getDeclaredFields();

         for(int var5 = 0; var5 < var4.length; ++var5) {
            int var6 = var4[var5].getModifiers();
            if(!Modifier.isStatic(var6) && Modifier.isPublic(var6)) {
               var3.add(var4[var5]);
            }
         }

         var1.addAll(0, var3);
      }

      return var1;
   }

   private List B() {
      Class var1 = this.getClass();
      Map var2 = v;
      List var3 = (List)v.get(var1);
      var3 = this.R();
      v.put(var1, var3);
      return var3;
   }

   public static List G(List var0, String... var1) {
      return p(var0, Arrays.asList(var1));
   }

   public static List p(List var0, List var1) {
      ArrayList var2 = new ArrayList(var0.size() + var1.size());
      var2.addAll(var0);
      var2.addAll(var1);
      return Collections.unmodifiableList(var2);
   }

   public static List B(String var0) {
      return Collections.unmodifiableList(Collections.singletonList(var0));
   }

   public static List o(String... var0) {
      return Collections.unmodifiableList(Arrays.asList(var0));
   }

   private static List d(Collection var0) {
      ArrayList var1 = new ArrayList(var0);
      Collections.sort(var1);
      return var1;
   }

   protected List m(boolean var1) {
      List var2 = this.u();
      HashSet var3 = new HashSet();

      for(Field var5 : var2) {
         var3.add(var5.getName());
      }

      List var6 = this.B();
      if(var6.size() != var2.size() && var2.size() > 1) {
         throw new Error("Structure.getFieldOrder() on " + this.getClass() + " does not provide enough names [" + var6.size() + "] (" + d(var6) + ") to match declared fields [" + var2.size() + "] (" + d(var3) + ")");
      } else {
         HashSet var7 = new HashSet(var6);
         if(!var7.equals(var3)) {
            throw new Error("Structure.getFieldOrder() on " + this.getClass() + " returns names (" + d(var6) + ") which do not match declared field names (" + d(var3) + ")");
         } else {
            this.p(var2, var6);
            return var2;
         }
      }
   }

   protected int N(boolean var1) {
      return this.O(var1, false);
   }

   static int b(Class var0) {
      return T(var0, (s)null);
   }

   static int T(Class var0, s var1) {
      Map var3 = m;
      s.e var2 = (s.e)m.get(var0);
      int var6 = !var2.z?var2.G:-1;
      var1 = Z(var0, r);
      var6 = var1.F();
      return var6;
   }

   int O(boolean var1, boolean var2) {
      int var3 = -1;
      Class var4 = this.getClass();
      Map var6 = m;
      s.e var5 = (s.e)m.get(var4);
      if(this.B != var5.V || this.c != var5.m) {
         var5 = this.c(var1, var2);
      }

      this.N = var5.W;
      this.O = var5.N;
      if(!var5.z) {
         var6 = m;
         if(!m.containsKey(var4) || this.B != 0 || this.c != null) {
            m.put(var4, var5);
         }
      }

      var3 = var5.G;
      return var3;
   }

   private void q(String var1, Class var2) {
      if(this.c != null) {
         ToNativeConverter var3 = this.c.U(var2);
         this.q(var1, var3.E());
      } else {
         if(var2.isArray()) {
            this.q(var1, var2.getComponentType());
         } else {
            this.j(var2);
         }

      }
   }

   private void V() {
      for(Field var3 : this.u()) {
         this.q(var3.getName(), var3.getType());
      }

   }

   private s.e c(boolean var1, boolean var2) {
      boolean var10000 = false;
      List var4 = this.m(var1);
      return null;
   }

   private void Z() {
      for(Field var3 : this.u()) {
         Object var4 = var3.get(this);
         this.b(var3, var3.getType());
      }

   }

   private Object b(Field var1, Class var2) {
      Object var3 = null;
      if(s.class.isAssignableFrom(var2) && !s.o.class.isAssignableFrom(var2)) {
         var3 = Z(var2, r);
         this.D(var1, var3);
      } else if(b.class.isAssignableFrom(var2)) {
         ck var4 = ck.n(var2);
         var3 = var4.t();
         this.D(var1, var3);
      }

      return var3;
   }

   private int A(int var1) {
      return this.f(var1, this.N);
   }

   private int f(int var1, int var2) {
      if(this.D != 1 && var1 % var2 != 0) {
         var1 += var2 - var1 % var2;
      }

      return var1;
   }

   protected int z() {
      if(this.E == -1) {
         this.N(true);
      }

      return this.N;
   }

   protected int E(Class var1, Object var2, boolean var3) {
      int var4 = 1;
      if(b.class.isAssignableFrom(var1)) {
         ck var5 = ck.n(var1);
         var1 = var5.E();
         var2 = (s)var5.Z(var2, new cu());
      }

      int var8 = Native.J(var1, var2);
      if(!var1.isPrimitive() && Long.class != var1 && Integer.class != var1 && Short.class != var1 && Character.class != var1 && Byte.class != var1 && Boolean.class != var1 && Float.class != var1 && Double.class != var1) {
         if((!Pointer.class.isAssignableFrom(var1) || Function.class.isAssignableFrom(var1)) && (!d.w || !Buffer.class.isAssignableFrom(var1)) && !Callback.class.isAssignableFrom(var1) && c.class != var1 && String.class != var1) {
            if(s.class.isAssignableFrom(var1)) {
               if(s.o.class.isAssignableFrom(var1)) {
                  var4 = Pointer.i;
               } else {
                  var2 = Z(var1, r);
                  var4 = ((s)var2).z();
               }
            } else {
               if(!var1.isArray()) {
                  throw new IllegalArgumentException("Type " + var1 + " has unknown native alignment");
               }

               var4 = this.E(var1.getComponentType(), (Object)null, var3);
            }
         } else {
            var4 = Pointer.i;
         }
      } else {
         var4 = var8;
      }

      if(this.D == 1) {
         var4 = 1;
      } else if(this.D == 3) {
         var4 = Math.min(8, var4);
      } else if(this.D == 2) {
         if(!d.k() || !d.X()) {
            var4 = Math.min(Native.F, var4);
         }

         if(d.q() && (var1 == Double.TYPE || var1 == Double.class)) {
            var4 = 4;
         }
      }

      return var4;
   }

   public String toString() {
      return this.a(Boolean.getBoolean("jna.dump_memory"));
   }

   public String a(boolean var1) {
      return this.X(0, true, var1);
   }

   private String y(Class var1) {
      String var2 = var1.getName();
      int var3 = var2.lastIndexOf(".");
      return var2.substring(var3 + 1);
   }

   private String X(int var1, boolean var2, boolean var3) {
      c.F();
      this.l();
      String var5 = System.getProperty("line.separator");
      String var6 = this.y(this.getClass()) + "(" + this.y() + ")";
      if(!(this.y() instanceof f)) {
         var6 = var6 + " (" + this.F() + " bytes)";
      }

      String var7 = "";
      int var8 = 0;
      if(var8 < var1) {
         var7 = var7 + "  ";
         ++var8;
      }

      String var15 = "...}";
      Iterator var9 = this.H().values().iterator();
      if(var9.hasNext()) {
         s.g var10 = (s.g)var9.next();
         Object var11 = this.K(var10.z);
         String var12 = this.y(var10.v);
         String var13 = "";
         var15 = var15 + var7;
         if(var10.v.isArray() && var11 != null) {
            var12 = this.y(var10.v.getComponentType());
            var13 = "[" + Array.getLength(var11) + "]";
         }

         var15 = var15 + "  " + var12 + " " + var10.k + var13 + "@" + Integer.toHexString(var10.G);
         if(var11 instanceof s) {
            var11 = ((s)var11).X(var1 + 1, !(var11 instanceof s.o), var3);
         }

         var15 = var15 + "=";
         if(var11 instanceof Long) {
            var15 = var15 + Long.toHexString(((Long)var11).longValue());
         }

         if(var11 instanceof Integer) {
            var15 = var15 + Integer.toHexString(((Integer)var11).intValue());
         }

         if(var11 instanceof Short) {
            var15 = var15 + Integer.toHexString(((Short)var11).shortValue());
         }

         if(var11 instanceof Byte) {
            var15 = var15 + Integer.toHexString(((Byte)var11).byteValue());
         }

         var15 = var15 + String.valueOf(var11).trim();
         var15 = var15 + var5;
         if(!var9.hasNext()) {
            var15 = var15 + var7 + "}";
         }
      }

      if(var1 == 0 && var3) {
         boolean var22 = true;
         var15 = var15 + var5 + "memory dump" + var5;
         byte[] var23 = this.y().F(0L, this.F());
         int var24 = 0;
         if(var24 < var23.length) {
            int var10000 = var24 % 4;
            var15 = var15 + "[";
            if(var23[var24] >= 0 && var23[var24] < 16) {
               var15 = var15 + "0";
            }

            var15 = var15 + Integer.toHexString(var23[var24] & 255);
            var10000 = var24 % 4;
            ++var24;
         }

         var15 = var15 + "]";
      }

      return var6 + " {" + var15;
   }

   public s[] Z(s[] var1) {
      this.l();
      if(this.g instanceof s.y) {
         f var2 = (f)this.g;
         int var3 = var1.length * this.F();
         if(var2.g() < (long)var3) {
            this.x(this.C(var3));
         }
      }

      var1[0] = this;
      int var4 = this.F();

      for(int var5 = 1; var5 < var1.length; ++var5) {
         var1[var5] = Z(this.getClass(), this.g.x((long)(var5 * var4), (long)var4));
         var1[var5].N();
      }

      if(!(this instanceof s.l)) {
         this.L = var1;
      }

      return var1;
   }

   public s[] R(int var1) {
      return this.Z((s[])((s[])Array.newInstance(this.getClass(), var1)));
   }

   private Class n() {
      return (this instanceof s.o || this instanceof s.l) && s.class.isAssignableFrom(this.getClass().getSuperclass())?this.getClass().getSuperclass():this.getClass();
   }

   public boolean J(s var1) {
      return this.h(var1, false);
   }

   public boolean h(s var1, boolean var2) {
      var1.y().c((long)var1.F());
      var1.v();
      this.y().c((long)this.F());
      this.v();
      byte[] var3 = var1.y().F(0L, var1.F());
      byte[] var4 = this.y().F(0L, this.F());
      if(var3.length == var4.length) {
         for(int var5 = 0; var5 < var3.length; ++var5) {
            if(var3[var5] != var4[var5]) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public boolean equals(Object var1) {
      return var1 instanceof s && var1.getClass() == this.getClass() && ((s)var1).y().equals(this.y());
   }

   public int hashCode() {
      Pointer var1 = this.y();
      return this.y().hashCode();
   }

   protected void q(Pointer var1) {
      this.U = var1.U;
   }

   Pointer w(s.g var1) {
      Class var2 = var1.v;
      Object var3 = this.K(var1.z);
      if(this.c != null) {
         ToNativeConverter var4 = this.c.U(var2);
         var2 = var4.E();
         var3 = var4.Z(var3, new cu());
      }

      return s.w.a(var3, var2);
   }

   Pointer C() {
      Pointer var1 = o((Object)this);
      this.q(var1);
      return var1;
   }

   public void w(boolean var1) {
      this.q(var1);
      this.Z(var1);
   }

   public void q(boolean var1) {
      this.n = var1;
   }

   public boolean P() {
      return this.n;
   }

   public void Z(boolean var1) {
      this.o = var1;
   }

   public boolean X() {
      return this.o;
   }

   static Pointer o(Object var0) {
      return s.w.q(var0);
   }

   private static s p(Class var0, long var1) {
      s var3 = Z(var0, var1 == 0L?r:new Pointer(var1));
      if(var1 != 0L) {
         var3.N();
      }

      return var3;
   }

   public static s Z(Class var0, Pointer var1) throws IllegalArgumentException {
      Constructor var2 = var0.getConstructor(new Class[]{Pointer.class});
      return (s)var2.newInstance(new Object[]{var1});
   }

   public static s F(Class var0) throws IllegalArgumentException {
      s var1 = (s)var0.newInstance();
      if(var1 instanceof s.l) {
         var1.s();
      }

      return var1;
   }

   s.g O() {
      Map var2 = m;
      s.e var1 = (s.e)m.get(this.getClass());
      return var1.K;
   }

   private static void O(s[] var0) {
      if(!s.o[].class.isAssignableFrom(var0.getClass())) {
         Pointer var1 = var0[0].y();
         int var2 = var0[0].F();

         for(int var3 = 1; var3 < var0.length; ++var3) {
            if(var0[var3].y().U != var1.U + (long)(var2 * var3)) {
               String var4 = "Structure array elements must use contiguous memory (bad backing address at Structure array index " + var3 + ")";
               throw new IllegalArgumentException(var4);
            }
         }

      }
   }

   public static void R(s[] var0) {
      O(var0);
      if(var0[0].L == var0) {
         var0[0].g();
      } else {
         for(int var1 = 0; var1 < var0.length; ++var1) {
            if(var0[var1] != null) {
               var0[var1].g();
            }
         }
      }

   }

   public void g() {
      if(this.P()) {
         this.b();
         if(this.L != null) {
            for(int var1 = 1; var1 < this.L.length; ++var1) {
               this.L[var1].g();
            }
         }
      }

   }

   public static void I(s[] var0) {
      O(var0);
      if(var0[0].L == var0) {
         var0[0].T();
      } else {
         for(int var1 = 0; var1 < var0.length; ++var1) {
            if(var0[var1] != null) {
               var0[var1].T();
            }
         }
      }

   }

   public void T() {
      if(this.X()) {
         this.v();
         if(this.L != null) {
            for(int var1 = 1; var1 < this.L.length; ++var1) {
               this.L[var1].T();
            }
         }
      }

   }

   protected int j(Class var1) {
      return this.j(var1, (Object)null);
   }

   protected int j(Class var1, Object var2) {
      return Native.J(var1, var2);
   }

   static void B(Class var0) {
      Z(var0, r);
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }

   private static class e {
      private int G;
      private int W;
      private final Map N;
      private int V;
      private q m;
      private boolean z;
      private s.g K;

      private e() {
         this.G = -1;
         this.W = 1;
         this.N = Collections.synchronizedMap(new LinkedHashMap());
         this.V = 0;
      }

      // $FF: synthetic method
      static int access$202(s.e var0, int var1) {
         return var0.V = var1;
      }

      // $FF: synthetic method
      static q access$302(s.e var0, q var1) {
         return var0.m = var1;
      }

      // $FF: synthetic method
      static boolean access$002(s.e var0, boolean var1) {
         return var0.z = var1;
      }

      // $FF: synthetic method
      static int access$402(s.e var0, int var1) {
         return var0.W = var1;
      }

      // $FF: synthetic method
      static s.g access$702(s.e var0, s.g var1) {
         return var0.K = var1;
      }

      // $FF: synthetic method
      static int access$102(s.e var0, int var1) {
         return var0.G = var1;
      }
   }

   protected static class g {
      public String k;
      public Class v;
      public Field z;
      public int q = -1;
      public int G = -1;
      public boolean O;
      public boolean F;
      public FromNativeConverter w;
      public ToNativeConverter f;
      public r r;

      public String toString() {
         return this.k + "@" + this.G + "[" + this.q + "] (" + this.v + ")";
      }
   }

   static class h extends AbstractCollection implements Set {
      s[] C;
      private int a;

      private void f(int var1) {
         if(this.C == null) {
            this.C = new s[var1 * 3 / 2];
         } else if(this.C.length < var1) {
            s[] var2 = new s[var1 * 3 / 2];
            System.arraycopy(this.C, 0, var2, 0, this.C.length);
            this.C = var2;
         }

      }

      public s[] t() {
         return this.C;
      }

      public int size() {
         return this.a;
      }

      public boolean contains(Object var1) {
         return this.Q((s)var1) != -1;
      }

      public boolean n(s var1) {
         if(!this.contains(var1)) {
            this.f(this.a + 1);
            this.C[this.a++] = var1;
         }

         return true;
      }

      private int Q(s var1) {
         c.F();
         int var3 = 0;
         if(var3 < this.a) {
            s var4 = this.C[var3];
            if(var1 == var4 || var1.getClass() == var4.getClass() && var1.F() == var4.F() && var1.y().equals(var4.y())) {
               return var3;
            }

            ++var3;
         }

         return -1;
      }

      public boolean remove(Object var1) {
         int var2 = this.Q((s)var1);
         if(var2 != -1) {
            if(--this.a >= 0) {
               this.C[var2] = this.C[this.a];
               this.C[this.a] = null;
            }

            return true;
         } else {
            return false;
         }
      }

      public Iterator iterator() {
         s[] var1 = new s[this.a];
         if(this.a > 0) {
            System.arraycopy(this.C, 0, var1, 0, this.a);
         }

         return Arrays.asList(var1).iterator();
      }

      private static xn a(xn var0) {
         return var0;
      }
   }

   public interface l {
   }

   public interface o {
   }

   static class w extends s {
      private static final Map j;
      private static final int I = 13;
      public s.w.d h;
      public short u;
      public short t = 13;
      public Pointer f;
      private static final String[] a;
      private static final String[] i;

      private w(s var1) {
         var1.x(true);
         Pointer[] var2;
         if(var1 instanceof g) {
            s.g var3 = ((g)var1).O();
            var2 = new Pointer[]{a(var1.K(var3.z), var3.v), null};
         } else {
            var2 = new Pointer[var1.H().size() + 1];
            int var6 = 0;

            for(s.g var5 : var1.H().values()) {
               var2[var6++] = var1.w(var5);
            }
         }

         this.P(var2);
      }

      private w(Object var1, Class var2) {
         int var3 = Array.getLength(var1);
         Pointer[] var4 = new Pointer[var3 + 1];
         Pointer var5 = a((Object)null, var2.getComponentType());

         for(int var6 = 0; var6 < var3; ++var6) {
            var4[var6] = var5;
         }

         this.P(var4);
      }

      protected List R() {
         return Arrays.asList(new String[]{b(-1052, 6999), b(-1054, -27246), b(-1056, 1479), b(-1051, 17612)});
      }

      private void P(Pointer[] var1) {
         this.f = new f((long)(Pointer.i * var1.length));
         this.f.j(0L, var1, 0, var1.length);
         this.v();
      }

      static Pointer q(Object var0) {
         return s.w.b.x;
      }

      private static Pointer a(Object var0, Class var1) {
         q var2 = Native.F(var1);
         ToNativeConverter var3 = var2.U(var1);
         var1 = var3.E();
         Map var9 = j;
         Object var4 = j.get(var1);
         if(var4 instanceof Pointer) {
            return (Pointer)var4;
         } else if(var4 instanceof s.w) {
            return ((s.w)var4).y();
         } else if((!d.w || !Buffer.class.isAssignableFrom(var1)) && !Callback.class.isAssignableFrom(var1)) {
            if(s.class.isAssignableFrom(var1)) {
               var0 = Z(var1, s.r);
               if(s.o.class.isAssignableFrom(var1)) {
                  j.put(var1, s.w.b.x);
                  return s.w.b.x;
               } else {
                  s.w var11 = new s.w((s)var0);
                  j.put(var1, var11);
                  return var11.y();
               }
            } else if(b.class.isAssignableFrom(var1)) {
               ck var10 = ck.n(var1);
               return a(var10.Z(var0, new cu()), var10.E());
            } else if(var1.isArray()) {
               s.w var5 = new s.w(var0, var1);
               j.put(var0, var5);
               return var5.y();
            } else {
               throw new IllegalArgumentException(b(-1055, -15672) + var1);
            }
         } else {
            j.put(var1, s.w.b.x);
            return s.w.b.x;
         }
      }

      static {
         // $FF: Couldn't be decompiled
      }

      private static IllegalArgumentException a(IllegalArgumentException var0) {
         return var0;
      }

      private static String b(int var0, int var1) {
         int var2 = (var0 ^ -1055) & '\uffff';
         if(i[var2] == null) {
            char[] var3 = a[var2].toCharArray();
            short var10000;
            switch(var3[0] & 255) {
            case 0:
               var10000 = 82;
               break;
            case 1:
               var10000 = 56;
               break;
            case 2:
               var10000 = 244;
               break;
            case 3:
               var10000 = 141;
               break;
            case 4:
               var10000 = 148;
               break;
            case 5:
               var10000 = 41;
               break;
            case 6:
               var10000 = 66;
               break;
            case 7:
               var10000 = 237;
               break;
            case 8:
               var10000 = 87;
               break;
            case 9:
               var10000 = 178;
               break;
            case 10:
               var10000 = 4;
               break;
            case 11:
               var10000 = 47;
               break;
            case 12:
               var10000 = 42;
               break;
            case 13:
               var10000 = 80;
               break;
            case 14:
               var10000 = 232;
               break;
            case 15:
               var10000 = 27;
               break;
            case 16:
               var10000 = 92;
               break;
            case 17:
               var10000 = 100;
               break;
            case 18:
               var10000 = 153;
               break;
            case 19:
               var10000 = 37;
               break;
            case 20:
               var10000 = 122;
               break;
            case 21:
               var10000 = 10;
               break;
            case 22:
               var10000 = 182;
               break;
            case 23:
               var10000 = 219;
               break;
            case 24:
               var10000 = 185;
               break;
            case 25:
               var10000 = 60;
               break;
            case 26:
               var10000 = 43;
               break;
            case 27:
               var10000 = 255;
               break;
            case 28:
               var10000 = 113;
               break;
            case 29:
               var10000 = 67;
               break;
            case 30:
               var10000 = 78;
               break;
            case 31:
               var10000 = 157;
               break;
            case 32:
               var10000 = 136;
               break;
            case 33:
               var10000 = 86;
               break;
            case 34:
               var10000 = 246;
               break;
            case 35:
               var10000 = 175;
               break;
            case 36:
               var10000 = 189;
               break;
            case 37:
               var10000 = 81;
               break;
            case 38:
               var10000 = 233;
               break;
            case 39:
               var10000 = 110;
               break;
            case 40:
               var10000 = 251;
               break;
            case 41:
               var10000 = 174;
               break;
            case 42:
               var10000 = 51;
               break;
            case 43:
               var10000 = 57;
               break;
            case 44:
               var10000 = 231;
               break;
            case 45:
               var10000 = 170;
               break;
            case 46:
               var10000 = 101;
               break;
            case 47:
               var10000 = 114;
               break;
            case 48:
               var10000 = 35;
               break;
            case 49:
               var10000 = 197;
               break;
            case 50:
               var10000 = 111;
               break;
            case 51:
               var10000 = 22;
               break;
            case 52:
               var10000 = 242;
               break;
            case 53:
               var10000 = 119;
               break;
            case 54:
               var10000 = 241;
               break;
            case 55:
               var10000 = 127;
               break;
            case 56:
               var10000 = 173;
               break;
            case 57:
               var10000 = 105;
               break;
            case 58:
               var10000 = 167;
               break;
            case 59:
               var10000 = 28;
               break;
            case 60:
               var10000 = 19;
               break;
            case 61:
               var10000 = 254;
               break;
            case 62:
               var10000 = 222;
               break;
            case 63:
               var10000 = 226;
               break;
            case 64:
               var10000 = 187;
               break;
            case 65:
               var10000 = 190;
               break;
            case 66:
               var10000 = 238;
               break;
            case 67:
               var10000 = 207;
               break;
            case 68:
               var10000 = 77;
               break;
            case 69:
               var10000 = 7;
               break;
            case 70:
               var10000 = 137;
               break;
            case 71:
               var10000 = 5;
               break;
            case 72:
               var10000 = 74;
               break;
            case 73:
               var10000 = 106;
               break;
            case 74:
               var10000 = 91;
               break;
            case 75:
               var10000 = 220;
               break;
            case 76:
               var10000 = 144;
               break;
            case 77:
               var10000 = 140;
               break;
            case 78:
               var10000 = 151;
               break;
            case 79:
               var10000 = 147;
               break;
            case 80:
               var10000 = 128;
               break;
            case 81:
               var10000 = 143;
               break;
            case 82:
               var10000 = 133;
               break;
            case 83:
               var10000 = 70;
               break;
            case 84:
               var10000 = 160;
               break;
            case 85:
               var10000 = 253;
               break;
            case 86:
               var10000 = 125;
               break;
            case 87:
               var10000 = 154;
               break;
            case 88:
               var10000 = 72;
               break;
            case 89:
               var10000 = 239;
               break;
            case 90:
               var10000 = 116;
               break;
            case 91:
               var10000 = 2;
               break;
            case 92:
               var10000 = 40;
               break;
            case 93:
               var10000 = 214;
               break;
            case 94:
               var10000 = 248;
               break;
            case 95:
               var10000 = 203;
               break;
            case 96:
               var10000 = 158;
               break;
            case 97:
               var10000 = 196;
               break;
            case 98:
               var10000 = 94;
               break;
            case 99:
               var10000 = 45;
               break;
            case 100:
               var10000 = 96;
               break;
            case 101:
               var10000 = 117;
               break;
            case 102:
               var10000 = 200;
               break;
            case 103:
               var10000 = 97;
               break;
            case 104:
               var10000 = 152;
               break;
            case 105:
               var10000 = 165;
               break;
            case 106:
               var10000 = 235;
               break;
            case 107:
               var10000 = 221;
               break;
            case 108:
               var10000 = 164;
               break;
            case 109:
               var10000 = 166;
               break;
            case 110:
               var10000 = 171;
               break;
            case 111:
               var10000 = 145;
               break;
            case 112:
               var10000 = 245;
               break;
            case 113:
               var10000 = 216;
               break;
            case 114:
               var10000 = 229;
               break;
            case 115:
               var10000 = 180;
               break;
            case 116:
               var10000 = 183;
               break;
            case 117:
               var10000 = 126;
               break;
            case 118:
               var10000 = 191;
               break;
            case 119:
               var10000 = 131;
               break;
            case 120:
               var10000 = 29;
               break;
            case 121:
               var10000 = 186;
               break;
            case 122:
               var10000 = 76;
               break;
            case 123:
               var10000 = 99;
               break;
            case 124:
               var10000 = 84;
               break;
            case 125:
               var10000 = 162;
               break;
            case 126:
               var10000 = 38;
               break;
            case 127:
               var10000 = 103;
               break;
            case 128:
               var10000 = 132;
               break;
            case 129:
               var10000 = 130;
               break;
            case 130:
               var10000 = 20;
               break;
            case 131:
               var10000 = 13;
               break;
            case 132:
               var10000 = 21;
               break;
            case 133:
               var10000 = 124;
               break;
            case 134:
               var10000 = 168;
               break;
            case 135:
               var10000 = 176;
               break;
            case 136:
               var10000 = 71;
               break;
            case 137:
               var10000 = 121;
               break;
            case 138:
               var10000 = 6;
               break;
            case 139:
               var10000 = 48;
               break;
            case 140:
               var10000 = 249;
               break;
            case 141:
               var10000 = 115;
               break;
            case 142:
               var10000 = 65;
               break;
            case 143:
               var10000 = 177;
               break;
            case 144:
               var10000 = 120;
               break;
            case 145:
               var10000 = 188;
               break;
            case 146:
               var10000 = 75;
               break;
            case 147:
               var10000 = 93;
               break;
            case 148:
               var10000 = 211;
               break;
            case 149:
               var10000 = 150;
               break;
            case 150:
               var10000 = 98;
               break;
            case 151:
               var10000 = 12;
               break;
            case 152:
               var10000 = 163;
               break;
            case 153:
               var10000 = 199;
               break;
            case 154:
               var10000 = 139;
               break;
            case 155:
               var10000 = 142;
               break;
            case 156:
               var10000 = 205;
               break;
            case 157:
               var10000 = 159;
               break;
            case 158:
               var10000 = 217;
               break;
            case 159:
               var10000 = 1;
               break;
            case 160:
               var10000 = 90;
               break;
            case 161:
               var10000 = 102;
               break;
            case 162:
               var10000 = 134;
               break;
            case 163:
               var10000 = 32;
               break;
            case 164:
               var10000 = 30;
               break;
            case 165:
               var10000 = 224;
               break;
            case 166:
               var10000 = 112;
               break;
            case 167:
               var10000 = 54;
               break;
            case 168:
               var10000 = 172;
               break;
            case 169:
               var10000 = 31;
               break;
            case 170:
               var10000 = 146;
               break;
            case 171:
               var10000 = 18;
               break;
            case 172:
               var10000 = 61;
               break;
            case 173:
               var10000 = 83;
               break;
            case 174:
               var10000 = 135;
               break;
            case 175:
               var10000 = 73;
               break;
            case 176:
               var10000 = 63;
               break;
            case 177:
               var10000 = 202;
               break;
            case 178:
               var10000 = 198;
               break;
            case 179:
               var10000 = 50;
               break;
            case 180:
               var10000 = 108;
               break;
            case 181:
               var10000 = 95;
               break;
            case 182:
               var10000 = 193;
               break;
            case 183:
               var10000 = 181;
               break;
            case 184:
               var10000 = 138;
               break;
            case 185:
               var10000 = 213;
               break;
            case 186:
               var10000 = 225;
               break;
            case 187:
               var10000 = 46;
               break;
            case 188:
               var10000 = 223;
               break;
            case 189:
               var10000 = 204;
               break;
            case 190:
               var10000 = 212;
               break;
            case 191:
               var10000 = 129;
               break;
            case 192:
               var10000 = 62;
               break;
            case 193:
               var10000 = 79;
               break;
            case 194:
               var10000 = 236;
               break;
            case 195:
               var10000 = 250;
               break;
            case 196:
               var10000 = 156;
               break;
            case 197:
               var10000 = 209;
               break;
            case 198:
               var10000 = 118;
               break;
            case 199:
               var10000 = 14;
               break;
            case 200:
               var10000 = 17;
               break;
            case 201:
               var10000 = 194;
               break;
            case 202:
               var10000 = 109;
               break;
            case 203:
               var10000 = 15;
               break;
            case 204:
               var10000 = 3;
               break;
            case 205:
               var10000 = 16;
               break;
            case 206:
               var10000 = 55;
               break;
            case 207:
               var10000 = 149;
               break;
            case 208:
               var10000 = 69;
               break;
            case 209:
               var10000 = 210;
               break;
            case 210:
               var10000 = 218;
               break;
            case 211:
               var10000 = 9;
               break;
            case 212:
               var10000 = 208;
               break;
            case 213:
               var10000 = 240;
               break;
            case 214:
               var10000 = 53;
               break;
            case 215:
               var10000 = 195;
               break;
            case 216:
               var10000 = 64;
               break;
            case 217:
               var10000 = 26;
               break;
            case 218:
               var10000 = 179;
               break;
            case 219:
               var10000 = 215;
               break;
            case 220:
               var10000 = 39;
               break;
            case 221:
               var10000 = 85;
               break;
            case 222:
               var10000 = 8;
               break;
            case 223:
               var10000 = 234;
               break;
            case 224:
               var10000 = 49;
               break;
            case 225:
               var10000 = 58;
               break;
            case 226:
               var10000 = 11;
               break;
            case 227:
               var10000 = 252;
               break;
            case 228:
               var10000 = 89;
               break;
            case 229:
               var10000 = 169;
               break;
            case 230:
               var10000 = 36;
               break;
            case 231:
               var10000 = 104;
               break;
            case 232:
               var10000 = 243;
               break;
            case 233:
               var10000 = 25;
               break;
            case 234:
               var10000 = 228;
               break;
            case 235:
               var10000 = 34;
               break;
            case 236:
               var10000 = 206;
               break;
            case 237:
               var10000 = 123;
               break;
            case 238:
               var10000 = 52;
               break;
            case 239:
               var10000 = 44;
               break;
            case 240:
               var10000 = 230;
               break;
            case 241:
               var10000 = 155;
               break;
            case 242:
               var10000 = 88;
               break;
            case 243:
               var10000 = 107;
               break;
            case 244:
               var10000 = 0;
               break;
            case 245:
               var10000 = 247;
               break;
            case 246:
               var10000 = 161;
               break;
            case 247:
               var10000 = 192;
               break;
            case 248:
               var10000 = 59;
               break;
            case 249:
               var10000 = 23;
               break;
            case 250:
               var10000 = 68;
               break;
            case 251:
               var10000 = 201;
               break;
            case 252:
               var10000 = 24;
               break;
            case 253:
               var10000 = 33;
               break;
            case 254:
               var10000 = 227;
               break;
            default:
               var10000 = 184;
            }

            short var4 = var10000;
            int var5 = (var1 & 255) - var4;
            var5 = var5 + 256;
            int var6 = ((var1 & '\uffff') >>> 8) - var4;
            var6 = var6 + 256;

            for(int var7 = 0; var7 < var3.length; ++var7) {
               int var8 = var7 % 2;
               var3[var7] = (char)(var3[var7] ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & 255;
            }

            i[var2] = (new String(var3)).intern();
         }

         return i[var2];
      }

      private static class b {
         private static Pointer N;
         private static Pointer u;
         private static Pointer D;
         private static Pointer y;
         private static Pointer Z;
         private static Pointer p;
         private static Pointer W;
         private static Pointer k;
         private static Pointer i;
         private static Pointer f;
         private static Pointer v;
         private static Pointer l;
         private static Pointer x;

         // $FF: synthetic method
         static Pointer access$900() {
            return N;
         }

         // $FF: synthetic method
         static Pointer access$1000() {
            return u;
         }

         // $FF: synthetic method
         static Pointer access$1100() {
            return D;
         }

         // $FF: synthetic method
         static Pointer access$1200() {
            return l;
         }

         // $FF: synthetic method
         static Pointer access$1300() {
            return f;
         }

         // $FF: synthetic method
         static Pointer access$1400() {
            return k;
         }

         // $FF: synthetic method
         static Pointer access$1500() {
            return W;
         }

         // $FF: synthetic method
         static Pointer access$1600() {
            return i;
         }

         // $FF: synthetic method
         static Pointer access$1700() {
            return p;
         }
      }

      public static class d extends cs {
         private static final long serialVersionUID = 1L;

         public d() {
            this(0L);
         }

         public d(long var1) {
            super(Native.s, var1);
         }
      }
   }

   private static class y extends f {
      public y(int var1) {
         super((long)var1);
         super.O();
      }

      public String toString() {
         return "auto-" + super.toString();
      }
   }
}
