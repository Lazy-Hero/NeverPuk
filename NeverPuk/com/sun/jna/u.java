package com.sun.jna;

import com.sun.jna.Callback;
import com.sun.jna.FromNativeConverter;
import com.sun.jna.Function;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.ToNativeConverter;
import com.sun.jna.b;
import com.sun.jna.c;
import com.sun.jna.c3;
import com.sun.jna.c4;
import com.sun.jna.ck;
import com.sun.jna.d;
import com.sun.jna.e;
import com.sun.jna.k;
import com.sun.jna.l;
import com.sun.jna.q;
import com.sun.jna.s;
import com.sun.jna.w;
import com.sun.jna.x;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class u extends WeakReference {
   static final Map g;
   static final Map c;
   static final Map N;
   static final Map W;
   private static final Map x;
   private static final Method h;
   private static final Map w;
   Pointer F;
   Pointer i;
   c4 O;
   Method s;
   int Y;
   private static final String[] a;
   private static final String[] b;

   static l V(Callback var0, l var1) {
      Map var2 = w;
      return (l)w.put(var0, var1);
   }

   private static ThreadGroup z(Callback var0, u.q var1) {
      c.F();
      l var3 = null;
      if(var0 instanceof u.a) {
         var0 = ((u.a)var0).R();
      }

      Map var4 = w;
      var3 = (l)w.get(var0);
      ThreadGroup var7 = null;
      if(var3 != null) {
         var7 = var3.s(var0);
         var1.w = var3.L(var0);
         var1.Y = var3.J(var0);
         var1.K = var3.L(var0);
         var1.v();
      }

      return var7;
   }

   public static Callback j(Class var0, Pointer var1) {
      return l(var0, var1, false);
   }

   private static Callback l(Class var0, Pointer var1, boolean var2) {
      return null;
   }

   private u(Callback var1, int var2, boolean var3) {
      super(var1);
      q var4 = Native.F(var1.getClass());
      this.Y = var2;
      boolean var7 = d.X();
      Method var8 = G(var1);
      Class[] var9 = var8.getParameterTypes();

      for(int var10 = 0; var10 < var9.length; ++var10) {
         if(var9[var10] == Float.TYPE || var9[var10] == Double.TYPE) {
            var3 = false;
            break;
         }

         if(var4.L(var9[var10]) != null) {
            var3 = false;
            break;
         }
      }

      if(var4.U(var8.getReturnType()) != null) {
         var3 = false;
      }

      String var16 = Native.r(var1.getClass());
      long var17 = 0L;
      this.s = G(var1);
      Class[] var5 = this.s.getParameterTypes();
      Class var6 = this.s.getReturnType();
      int var11 = 1;
      if(var1 instanceof w) {
         var11 |= 2;
      }

      var17 = Native.createNativeCallback(var1, this.s, var5, var6, var2, var11, var16);
      this.F = var17 != 0L?new Pointer(var17):null;
      x.put(this, new WeakReference(this));
   }

   private Class i(Class var1) {
      if(s.class.isAssignableFrom(var1)) {
         s.B(var1);
         if(!s.l.class.isAssignableFrom(var1)) {
            return Pointer.class;
         }
      } else {
         if(b.class.isAssignableFrom(var1)) {
            return ck.n(var1).E();
         }

         if(var1 == String.class || var1 == c.class || var1 == String[].class || var1 == c[].class || Callback.class.isAssignableFrom(var1)) {
            return Pointer.class;
         }
      }

      return var1;
   }

   private static Method I(Method var0) {
      if(var0.getParameterTypes().length > 256) {
         String var1 = a(5996, -6773) + var0;
         throw new UnsupportedOperationException(var1);
      } else {
         return var0;
      }
   }

   static Class M(Class var0) {
      if(!Callback.class.isAssignableFrom(var0)) {
         throw new IllegalArgumentException(var0.getName() + a(5995, -29411));
      } else if(var0.isInterface()) {
         return var0;
      } else {
         Class[] var1 = var0.getInterfaces();

         for(int var2 = 0; var2 < var1.length; ++var2) {
            if(Callback.class.isAssignableFrom(var1[var2])) {
               B(var1[var2]);
               return var1[var2];
            }
         }

         if(Callback.class.isAssignableFrom(var0.getSuperclass())) {
            return M(var0.getSuperclass());
         } else {
            return var0;
         }
      }
   }

   private static Method G(Callback var0) {
      return B(M(var0.getClass()));
   }

   private static Method B(Class var0) {
      Method[] var1 = var0.getDeclaredMethods();
      Method[] var2 = var0.getMethods();
      HashSet var3 = new HashSet(Arrays.asList(var1));
      var3.retainAll(Arrays.asList(var2));
      Iterator var4 = var3.iterator();

      while(var4.hasNext()) {
         Method var5 = (Method)var4.next();
         if(Callback.r.contains(var5.getName())) {
            var4.remove();
         }
      }

      Method[] var7 = (Method[])var3.toArray(new Method[var3.size()]);
      if(var7.length == 1) {
         return I(var7[0]);
      } else {
         for(int var8 = 0; var8 < var7.length; ++var8) {
            Method var6 = var7[var8];
            if(a(5992, -14297).equals(var6.getName())) {
               return I(var6);
            }
         }

         String var9 = a(5998, 23781);
         throw new IllegalArgumentException(var9);
      }
   }

   private void o(int var1) {
      this.F.c((long)Pointer.i, var1);
   }

   public Pointer w() {
      if(this.i == null) {
         this.i = this.F.f(0L);
      }

      return this.i;
   }

   protected void finalize() {
      this.t();
   }

   protected synchronized void t() {
      net.u.d[] var1 = c.F();
      if(this.F != null) {
         Native.freeNativeCallback(this.F.U);
         this.F.U = 0L;
         this.F = null;
         x.remove(this);
      }

   }

   static void m() {
      for(u var2 : new LinkedList(x.keySet())) {
         var2.t();
      }

   }

   private Callback j() {
      return (Callback)this.get();
   }

   private static Pointer y(Callback var0) {
      if(Proxy.isProxyClass(var0.getClass())) {
         InvocationHandler var1 = Proxy.getInvocationHandler(var0);
         if(var1 instanceof u.t) {
            return ((u.t)var1).W();
         }
      }

      return null;
   }

   public static Pointer l(Callback var0) {
      return o(var0, false);
   }

   private static Pointer o(Callback var0, boolean var1) {
      Object var10000 = null;
      return null;
   }

   private static boolean F(Class var0) {
      return var0 == Void.TYPE || var0 == Void.class || var0 == Boolean.TYPE || var0 == Boolean.class || var0 == Byte.TYPE || var0 == Byte.class || var0 == Short.TYPE || var0 == Short.class || var0 == Character.TYPE || var0 == Character.class || var0 == Integer.TYPE || var0 == Integer.class || var0 == Long.TYPE || var0 == Long.class || var0 == Float.TYPE || var0 == Float.class || var0 == Double.TYPE || var0 == Double.class || s.l.class.isAssignableFrom(var0) && s.class.isAssignableFrom(var0) || Pointer.class.isAssignableFrom(var0);
   }

   private static Pointer o(Object var0, boolean var1) {
      x var2 = new x(var0.toString(), var1);
      W.put(var0, var2);
      return var2.k();
   }

   // $FF: synthetic method
   static Pointer access$100(Object var0, boolean var1) {
      return o(var0, var1);
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 5991) & '\uffff';
      if(b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch(var3[0] & 255) {
         case 0:
            var10000 = 96;
            break;
         case 1:
            var10000 = 51;
            break;
         case 2:
            var10000 = 155;
            break;
         case 3:
            var10000 = 10;
            break;
         case 4:
            var10000 = 49;
            break;
         case 5:
            var10000 = 115;
            break;
         case 6:
            var10000 = 193;
            break;
         case 7:
            var10000 = 203;
            break;
         case 8:
            var10000 = 200;
            break;
         case 9:
            var10000 = 222;
            break;
         case 10:
            var10000 = 7;
            break;
         case 11:
            var10000 = 57;
            break;
         case 12:
            var10000 = 218;
            break;
         case 13:
            var10000 = 143;
            break;
         case 14:
            var10000 = 52;
            break;
         case 15:
            var10000 = 123;
            break;
         case 16:
            var10000 = 194;
            break;
         case 17:
            var10000 = 99;
            break;
         case 18:
            var10000 = 117;
            break;
         case 19:
            var10000 = 47;
            break;
         case 20:
            var10000 = 212;
            break;
         case 21:
            var10000 = 245;
            break;
         case 22:
            var10000 = 249;
            break;
         case 23:
            var10000 = 13;
            break;
         case 24:
            var10000 = 139;
            break;
         case 25:
            var10000 = 81;
            break;
         case 26:
            var10000 = 209;
            break;
         case 27:
            var10000 = 145;
            break;
         case 28:
            var10000 = 213;
            break;
         case 29:
            var10000 = 160;
            break;
         case 30:
            var10000 = 20;
            break;
         case 31:
            var10000 = 15;
            break;
         case 32:
            var10000 = 68;
            break;
         case 33:
            var10000 = 116;
            break;
         case 34:
            var10000 = 87;
            break;
         case 35:
            var10000 = 23;
            break;
         case 36:
            var10000 = 244;
            break;
         case 37:
            var10000 = 227;
            break;
         case 38:
            var10000 = 102;
            break;
         case 39:
            var10000 = 56;
            break;
         case 40:
            var10000 = 189;
            break;
         case 41:
            var10000 = 224;
            break;
         case 42:
            var10000 = 43;
            break;
         case 43:
            var10000 = 16;
            break;
         case 44:
            var10000 = 104;
            break;
         case 45:
            var10000 = 226;
            break;
         case 46:
            var10000 = 98;
            break;
         case 47:
            var10000 = 137;
            break;
         case 48:
            var10000 = 141;
            break;
         case 49:
            var10000 = 180;
            break;
         case 50:
            var10000 = 252;
            break;
         case 51:
            var10000 = 171;
            break;
         case 52:
            var10000 = 33;
            break;
         case 53:
            var10000 = 127;
            break;
         case 54:
            var10000 = 177;
            break;
         case 55:
            var10000 = 150;
            break;
         case 56:
            var10000 = 181;
            break;
         case 57:
            var10000 = 80;
            break;
         case 58:
            var10000 = 3;
            break;
         case 59:
            var10000 = 21;
            break;
         case 60:
            var10000 = 161;
            break;
         case 61:
            var10000 = 173;
            break;
         case 62:
            var10000 = 152;
            break;
         case 63:
            var10000 = 37;
            break;
         case 64:
            var10000 = 30;
            break;
         case 65:
            var10000 = 237;
            break;
         case 66:
            var10000 = 26;
            break;
         case 67:
            var10000 = 248;
            break;
         case 68:
            var10000 = 184;
            break;
         case 69:
            var10000 = 9;
            break;
         case 70:
            var10000 = 4;
            break;
         case 71:
            var10000 = 190;
            break;
         case 72:
            var10000 = 253;
            break;
         case 73:
            var10000 = 95;
            break;
         case 74:
            var10000 = 71;
            break;
         case 75:
            var10000 = 247;
            break;
         case 76:
            var10000 = 242;
            break;
         case 77:
            var10000 = 36;
            break;
         case 78:
            var10000 = 186;
            break;
         case 79:
            var10000 = 108;
            break;
         case 80:
            var10000 = 58;
            break;
         case 81:
            var10000 = 121;
            break;
         case 82:
            var10000 = 61;
            break;
         case 83:
            var10000 = 32;
            break;
         case 84:
            var10000 = 112;
            break;
         case 85:
            var10000 = 243;
            break;
         case 86:
            var10000 = 19;
            break;
         case 87:
            var10000 = 92;
            break;
         case 88:
            var10000 = 140;
            break;
         case 89:
            var10000 = 146;
            break;
         case 90:
            var10000 = 172;
            break;
         case 91:
            var10000 = 38;
            break;
         case 92:
            var10000 = 250;
            break;
         case 93:
            var10000 = 204;
            break;
         case 94:
            var10000 = 205;
            break;
         case 95:
            var10000 = 74;
            break;
         case 96:
            var10000 = 122;
            break;
         case 97:
            var10000 = 119;
            break;
         case 98:
            var10000 = 45;
            break;
         case 99:
            var10000 = 88;
            break;
         case 100:
            var10000 = 0;
            break;
         case 101:
            var10000 = 157;
            break;
         case 102:
            var10000 = 50;
            break;
         case 103:
            var10000 = 76;
            break;
         case 104:
            var10000 = 46;
            break;
         case 105:
            var10000 = 28;
            break;
         case 106:
            var10000 = 106;
            break;
         case 107:
            var10000 = 126;
            break;
         case 108:
            var10000 = 113;
            break;
         case 109:
            var10000 = 65;
            break;
         case 110:
            var10000 = 225;
            break;
         case 111:
            var10000 = 29;
            break;
         case 112:
            var10000 = 85;
            break;
         case 113:
            var10000 = 60;
            break;
         case 114:
            var10000 = 125;
            break;
         case 115:
            var10000 = 59;
            break;
         case 116:
            var10000 = 22;
            break;
         case 117:
            var10000 = 206;
            break;
         case 118:
            var10000 = 183;
            break;
         case 119:
            var10000 = 162;
            break;
         case 120:
            var10000 = 192;
            break;
         case 121:
            var10000 = 41;
            break;
         case 122:
            var10000 = 101;
            break;
         case 123:
            var10000 = 201;
            break;
         case 124:
            var10000 = 66;
            break;
         case 125:
            var10000 = 134;
            break;
         case 126:
            var10000 = 254;
            break;
         case 127:
            var10000 = 168;
            break;
         case 128:
            var10000 = 53;
            break;
         case 129:
            var10000 = 89;
            break;
         case 130:
            var10000 = 191;
            break;
         case 131:
            var10000 = 232;
            break;
         case 132:
            var10000 = 211;
            break;
         case 133:
            var10000 = 154;
            break;
         case 134:
            var10000 = 40;
            break;
         case 135:
            var10000 = 169;
            break;
         case 136:
            var10000 = 18;
            break;
         case 137:
            var10000 = 118;
            break;
         case 138:
            var10000 = 105;
            break;
         case 139:
            var10000 = 174;
            break;
         case 140:
            var10000 = 151;
            break;
         case 141:
            var10000 = 165;
            break;
         case 142:
            var10000 = 170;
            break;
         case 143:
            var10000 = 182;
            break;
         case 144:
            var10000 = 79;
            break;
         case 145:
            var10000 = 153;
            break;
         case 146:
            var10000 = 187;
            break;
         case 147:
            var10000 = 221;
            break;
         case 148:
            var10000 = 103;
            break;
         case 149:
            var10000 = 231;
            break;
         case 150:
            var10000 = 197;
            break;
         case 151:
            var10000 = 91;
            break;
         case 152:
            var10000 = 111;
            break;
         case 153:
            var10000 = 97;
            break;
         case 154:
            var10000 = 54;
            break;
         case 155:
            var10000 = 148;
            break;
         case 156:
            var10000 = 214;
            break;
         case 157:
            var10000 = 135;
            break;
         case 158:
            var10000 = 39;
            break;
         case 159:
            var10000 = 188;
            break;
         case 160:
            var10000 = 12;
            break;
         case 161:
            var10000 = 93;
            break;
         case 162:
            var10000 = 196;
            break;
         case 163:
            var10000 = 144;
            break;
         case 164:
            var10000 = 62;
            break;
         case 165:
            var10000 = 11;
            break;
         case 166:
            var10000 = 233;
            break;
         case 167:
            var10000 = 166;
            break;
         case 168:
            var10000 = 132;
            break;
         case 169:
            var10000 = 235;
            break;
         case 170:
            var10000 = 94;
            break;
         case 171:
            var10000 = 176;
            break;
         case 172:
            var10000 = 100;
            break;
         case 173:
            var10000 = 128;
            break;
         case 174:
            var10000 = 72;
            break;
         case 175:
            var10000 = 159;
            break;
         case 176:
            var10000 = 107;
            break;
         case 177:
            var10000 = 158;
            break;
         case 178:
            var10000 = 83;
            break;
         case 179:
            var10000 = 198;
            break;
         case 180:
            var10000 = 207;
            break;
         case 181:
            var10000 = 90;
            break;
         case 182:
            var10000 = 234;
            break;
         case 183:
            var10000 = 130;
            break;
         case 184:
            var10000 = 82;
            break;
         case 185:
            var10000 = 229;
            break;
         case 186:
            var10000 = 1;
            break;
         case 187:
            var10000 = 210;
            break;
         case 188:
            var10000 = 5;
            break;
         case 189:
            var10000 = 216;
            break;
         case 190:
            var10000 = 17;
            break;
         case 191:
            var10000 = 73;
            break;
         case 192:
            var10000 = 156;
            break;
         case 193:
            var10000 = 64;
            break;
         case 194:
            var10000 = 202;
            break;
         case 195:
            var10000 = 35;
            break;
         case 196:
            var10000 = 178;
            break;
         case 197:
            var10000 = 223;
            break;
         case 198:
            var10000 = 6;
            break;
         case 199:
            var10000 = 2;
            break;
         case 200:
            var10000 = 217;
            break;
         case 201:
            var10000 = 142;
            break;
         case 202:
            var10000 = 215;
            break;
         case 203:
            var10000 = 63;
            break;
         case 204:
            var10000 = 31;
            break;
         case 205:
            var10000 = 70;
            break;
         case 206:
            var10000 = 240;
            break;
         case 207:
            var10000 = 34;
            break;
         case 208:
            var10000 = 8;
            break;
         case 209:
            var10000 = 14;
            break;
         case 210:
            var10000 = 48;
            break;
         case 211:
            var10000 = 175;
            break;
         case 212:
            var10000 = 44;
            break;
         case 213:
            var10000 = 219;
            break;
         case 214:
            var10000 = 78;
            break;
         case 215:
            var10000 = 131;
            break;
         case 216:
            var10000 = 255;
            break;
         case 217:
            var10000 = 25;
            break;
         case 218:
            var10000 = 120;
            break;
         case 219:
            var10000 = 230;
            break;
         case 220:
            var10000 = 77;
            break;
         case 221:
            var10000 = 220;
            break;
         case 222:
            var10000 = 199;
            break;
         case 223:
            var10000 = 228;
            break;
         case 224:
            var10000 = 239;
            break;
         case 225:
            var10000 = 24;
            break;
         case 226:
            var10000 = 179;
            break;
         case 227:
            var10000 = 129;
            break;
         case 228:
            var10000 = 67;
            break;
         case 229:
            var10000 = 27;
            break;
         case 230:
            var10000 = 164;
            break;
         case 231:
            var10000 = 241;
            break;
         case 232:
            var10000 = 236;
            break;
         case 233:
            var10000 = 84;
            break;
         case 234:
            var10000 = 167;
            break;
         case 235:
            var10000 = 55;
            break;
         case 236:
            var10000 = 185;
            break;
         case 237:
            var10000 = 109;
            break;
         case 238:
            var10000 = 75;
            break;
         case 239:
            var10000 = 86;
            break;
         case 240:
            var10000 = 238;
            break;
         case 241:
            var10000 = 110;
            break;
         case 242:
            var10000 = 133;
            break;
         case 243:
            var10000 = 69;
            break;
         case 244:
            var10000 = 124;
            break;
         case 245:
            var10000 = 246;
            break;
         case 246:
            var10000 = 149;
            break;
         case 247:
            var10000 = 114;
            break;
         case 248:
            var10000 = 42;
            break;
         case 249:
            var10000 = 147;
            break;
         case 250:
            var10000 = 136;
            break;
         case 251:
            var10000 = 163;
            break;
         case 252:
            var10000 = 251;
            break;
         case 253:
            var10000 = 208;
            break;
         case 254:
            var10000 = 195;
            break;
         default:
            var10000 = 138;
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

         b[var2] = (new String(var3)).intern();
      }

      return b[var2];
   }

   private class a implements c4 {
      private final Method i;
      private ToNativeConverter y;
      private final FromNativeConverter[] I;
      private final String C;

      public a(Method var2, q var3, String var4) {
         this.i = var2;
         this.C = var4;
         Class[] var5 = var2.getParameterTypes();
         Class var6 = var2.getReturnType();
         this.I = new FromNativeConverter[var5.length];
         if(b.class.isAssignableFrom(var6)) {
            this.y = ck.n(var6);
         } else {
            this.y = var3.U(var6);
         }

         for(int var7 = 0; var7 < this.I.length; ++var7) {
            if(b.class.isAssignableFrom(var5[var7])) {
               this.I[var7] = new ck(var5[var7]);
            } else {
               this.I[var7] = var3.L(var5[var7]);
            }
         }

         if(!var2.isAccessible()) {
            var2.setAccessible(true);
         }

      }

      public Callback R() {
         return u.this.j();
      }

      private Object Q(Object[] var1) {
         Class[] var2 = this.i.getParameterTypes();
         Object[] var3 = new Object[var1.length];

         for(int var4 = 0; var4 < var1.length; ++var4) {
            Class var5 = var2[var4];
            Object var6 = var1[var4];
            if(this.I[var4] != null) {
               e var7 = new e(var5, this.i, var1, var4);
               var3[var4] = this.I[var4].i(var6, var7);
            } else {
               var3[var4] = this.p(var6, var5);
            }
         }

         Object var8 = null;
         Callback var10 = this.R();
         var8 = this.p(this.i.invoke(var10, var3));

         for(int var11 = 0; var11 < var3.length; ++var11) {
            if(var3[var11] instanceof s && !(var3[var11] instanceof s.l)) {
               ((s)var3[var11]).T();
            }
         }

         return var8;
      }

      public Object M(Object[] var1) {
         return this.Q(var1);
      }

      private Object p(Object var1, Class var2) {
         net.u.d[] var3 = c.F();
         if(var1 instanceof Pointer) {
            if(var2 == String.class) {
               var1 = ((Pointer)var1).u(0L, this.C);
            }

            if(var2 == c.class) {
               var1 = new c(((Pointer)var1).Z(0L));
            }

            if(var2 == String[].class) {
               var1 = ((Pointer)var1).y(0L, this.C);
            }

            if(var2 == c[].class) {
               var1 = ((Pointer)var1).e(0L);
            }

            if(Callback.class.isAssignableFrom(var2)) {
               var1 = u.j(var2, (Pointer)var1);
            }

            if(!s.class.isAssignableFrom(var2)) {
               return var1;
            }

            if(s.l.class.isAssignableFrom(var2)) {
               s var4 = s.F(var2);
               byte[] var5 = new byte[var4.F()];
               ((Pointer)var1).F(0L, var5, 0, var5.length);
               var4.y().Y(0L, var5, 0, var5.length);
               var4.b();
               var1 = var4;
            }

            s var6 = s.Z(var2, (Pointer)var1);
            var6.N();
            var1 = var6;
         }

         if((Boolean.TYPE == var2 || Boolean.class == var2) && var1 instanceof Number) {
            var1 = Function.c(((Number)var1).intValue() != 0);
         }

         return var1;
      }

      private Object p(Object var1) {
         if(this.y != null) {
            var1 = this.y.Z(var1, new c3(this.i));
         }

         return null;
      }

      public Class[] b() {
         return this.i.getParameterTypes();
      }

      public Class a() {
         return this.i.getReturnType();
      }

      private static RuntimeException a(RuntimeException var0) {
         return var0;
      }
   }

   static class q extends s {
      public static final List i = o(new String[]{"daemon", "detach", "name"});
      public boolean Y;
      public boolean K;
      public String w;

      q() {
         this.a("utf8");
      }

      protected List R() {
         return i;
      }
   }

   private static class t implements InvocationHandler {
      private final Function e;
      private final Map N;

      public t(Pointer var1, int var2, Map var3) {
         this.N = var3;
         this.e = new Function(var1, var2, (String)var3.get("string-encoding"));
      }

      public Object invoke(Object var1, Method var2, Object[] var3) throws Throwable {
         net.u.d[] var4 = c.F();
         if(k.i.z.equals(var2)) {
            String var8 = "Proxy interface to " + this.e;
            Method var6 = (Method)this.N.get("invoking-method");
            Class var7 = u.M(var6.getDeclaringClass());
            var8 = var8 + " (" + var7.getName() + ")";
            return var8;
         } else if(k.i.c.equals(var2)) {
            return Integer.valueOf(this.hashCode());
         } else if(k.i.P.equals(var2)) {
            Object var5 = var3[0];
            return var5 != null && Proxy.isProxyClass(var5.getClass())?Function.c(Proxy.getInvocationHandler(var5) == this):Boolean.FALSE;
         } else {
            if(Function.S(var2)) {
               var3 = Function.l(var3);
            }

            return this.e.z(var2.getReturnType(), var3, this.N);
         }
      }

      public Pointer W() {
         return this.e;
      }

      private static Throwable a(Throwable var0) {
         return var0;
      }
   }
}
