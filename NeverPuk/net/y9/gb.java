package net.y9;

import java.util.Iterator;
import javax.annotation.Nullable;
import net.xn;
import net.y9.g3;
import net.y9.l;
import net.y9.r6;
import net.yv.o8;
import net.yz.aq;
import net.yz.au;
import net.yz.ax;

public class gb extends l {
   public static final net.yr.w N = net.yr.w.l("facing", gb.p.class);
   public static final net.yr.o R = net.yr.o.k("powered");
   protected static final net.u.e F = new net.u.e(0.3125D, 0.20000000298023224D, 0.625D, 0.6875D, 0.800000011920929D, 1.0D);
   protected static final net.u.e p = new net.u.e(0.3125D, 0.20000000298023224D, 0.0D, 0.6875D, 0.800000011920929D, 0.375D);
   protected static final net.u.e H = new net.u.e(0.625D, 0.20000000298023224D, 0.3125D, 1.0D, 0.800000011920929D, 0.6875D);
   protected static final net.u.e o = new net.u.e(0.0D, 0.20000000298023224D, 0.3125D, 0.375D, 0.800000011920929D, 0.6875D);
   protected static final net.u.e l = new net.u.e(0.25D, 0.0D, 0.25D, 0.75D, 0.6000000238418579D, 0.75D);
   protected static final net.u.e W = new net.u.e(0.25D, 0.4000000059604645D, 0.25D, 0.75D, 1.0D, 0.75D);

   protected gb() {
      super(net.y1.l.c);
      this.r(this.b.T().s(N, gb.p.NORTH).s(R, Boolean.valueOf(false)));
      this.f(net.ys.r.i);
   }

   @Nullable
   public net.u.e B(net.yw.n var1, o8 var2, net.u.j var3) {
      return q;
   }

   public boolean V(net.yw.n var1) {
      return false;
   }

   public boolean k(net.yw.n var1) {
      return false;
   }

   public boolean C(net.yv.r var1, net.u.j var2, aq var3) {
      return c(var1, var2, var3);
   }

   public boolean J(net.yv.r var1, net.u.j var2) {
      for(aq var6 : aq.values()) {
         if(c(var1, var2, var6)) {
            return true;
         }
      }

      return false;
   }

   protected static boolean c(net.yv.r var0, net.u.j var1, aq var2) {
      return r6.p(var0, var1, var2);
   }

   public net.yw.n U(net.yv.r var1, net.u.j var2, aq var3, float var4, float var5, float var6, int var7, net.ne.a var8) {
      g3.v.w();
      net.yw.n var10 = this.p().s(R, Boolean.valueOf(false));
      if(c(var1, var2, var3)) {
         return var10.s(N, gb.p.b(var3, var8.V()));
      } else {
         Iterator var11 = aq.u.HORIZONTAL.iterator();
         if(var11.hasNext()) {
            aq var12 = (aq)var11.next();
            if(var12 != var3 && c(var1, var2, var12)) {
               return var10.s(N, gb.p.b(var12, var8.V()));
            }
         }

         return var1.Z(var2.b()).z()?var10.s(N, gb.p.b(aq.UP, var8.V())):var10;
      }
   }

   public void Z(net.yw.n var1, net.yv.r var2, net.u.j var3, l var4, net.u.j var5) {
      if(this.Z(var2, var3, var1) && !c(var2, var3, ((gb.p)var1.i(N)).o())) {
         this.N(var2, var3, var1, 0);
         var2.J(var3);
      }

   }

   private boolean Z(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      if(this.J(var1, var2)) {
         return true;
      } else {
         this.N(var1, var2, var3, 0);
         var1.J(var2);
         return false;
      }
   }

   public net.u.e k(net.yw.n var1, o8 var2, net.u.j var3) {
      switch(null.W[((gb.p)var1.i(N)).ordinal()]) {
      case 1:
      default:
         return o;
      case 2:
         return H;
      case 3:
         return p;
      case 4:
         return F;
      case 5:
      case 6:
         return l;
      case 7:
      case 8:
         return W;
      }
   }

   public boolean N(net.yv.r var1, net.u.j var2, net.yw.n var3, net.r.r var4, net.yz.k var5, aq var6, float var7, float var8, float var9) {
      if(var1.x) {
         return true;
      } else {
         var3 = var3.C(R);
         var1.k(var2, var3, 3);
         float var10 = ((Boolean)var3.i(R)).booleanValue()?0.6F:0.5F;
         var1.M((net.r.r)null, var2, net.nb.l.MW, net.yz.p.BLOCKS, 0.3F, var10);
         var1.b(var2, this, false);
         aq var11 = ((gb.p)var3.i(N)).o();
         var1.b(var2.C(var11.f()), this, false);
         return true;
      }
   }

   public void V(net.yv.r var1, net.u.j var2, net.yw.n var3) {
      if(((Boolean)var3.i(R)).booleanValue()) {
         var1.b(var2, this, false);
         aq var4 = ((gb.p)var3.i(N)).o();
         var1.b(var2.C(var4.f()), this, false);
      }

      super.V(var1, var2, var3);
   }

   public int L(net.yw.n var1, o8 var2, net.u.j var3, aq var4) {
      return ((Boolean)var1.i(R)).booleanValue()?15:0;
   }

   public int n(net.yw.n var1, o8 var2, net.u.j var3, aq var4) {
      return !((Boolean)var1.i(R)).booleanValue()?0:(((gb.p)var1.i(N)).o() == var4?15:0);
   }

   public boolean s(net.yw.n var1) {
      return true;
   }

   public net.yw.n D(int var1) {
      return this.p().s(N, gb.p.c(var1 & 7)).s(R, Boolean.valueOf((var1 & 8) > 0));
   }

   public int d(net.yw.n var1) {
      int var2 = 0;
      var2 = var2 | ((gb.p)var1.i(N)).z();
      if(((Boolean)var1.i(R)).booleanValue()) {
         var2 |= 8;
      }

      return var2;
   }

   public net.yw.n G(net.yw.n var1, net.yz.l var2) {
      int[] var3 = g3.v.w();
      switch(null.H[var2.ordinal()]) {
      case 1:
         switch(null.W[((gb.p)var1.i(N)).ordinal()]) {
         case 1:
            return var1.s(N, gb.p.WEST);
         case 2:
            return var1.s(N, gb.p.EAST);
         case 3:
            return var1.s(N, gb.p.NORTH);
         case 4:
            return var1.s(N, gb.p.SOUTH);
         default:
            return var1;
         }
      case 2:
         switch(null.W[((gb.p)var1.i(N)).ordinal()]) {
         case 1:
            return var1.s(N, gb.p.NORTH);
         case 2:
            return var1.s(N, gb.p.SOUTH);
         case 3:
            return var1.s(N, gb.p.EAST);
         case 4:
            return var1.s(N, gb.p.WEST);
         case 5:
            return var1.s(N, gb.p.UP_X);
         case 6:
            return var1.s(N, gb.p.UP_Z);
         case 7:
            return var1.s(N, gb.p.DOWN_Z);
         case 8:
            return var1.s(N, gb.p.DOWN_X);
         }
      case 3:
         switch(null.W[((gb.p)var1.i(N)).ordinal()]) {
         case 1:
            return var1.s(N, gb.p.SOUTH);
         case 2:
            return var1.s(N, gb.p.NORTH);
         case 3:
            return var1.s(N, gb.p.WEST);
         case 4:
            return var1.s(N, gb.p.EAST);
         case 5:
            return var1.s(N, gb.p.UP_X);
         case 6:
            return var1.s(N, gb.p.UP_Z);
         case 7:
            return var1.s(N, gb.p.DOWN_Z);
         case 8:
            return var1.s(N, gb.p.DOWN_X);
         }
      default:
         return var1;
      }
   }

   public net.yw.n P(net.yw.n var1, ax var2) {
      return var1.b(var2.S(((gb.p)var1.i(N)).o()));
   }

   protected net.yw.q k() {
      return new net.yw.q(this, new net.yr.h[]{N, R});
   }

   public net.yw.g U(o8 var1, net.yw.n var2, net.u.j var3, aq var4) {
      return net.yw.g.UNDEFINED;
   }

   private static xn a(xn var0) {
      return var0;
   }

   public static enum p implements au {
      DOWN_X,
      EAST,
      WEST,
      SOUTH,
      NORTH,
      UP_Z,
      UP_X,
      DOWN_Z;

      private static final gb.p[] n;
      private final int m;
      private final String W;
      private final aq G;
      private static final String[] a;
      private static final String[] b;

      private p(int var3, String var4, aq var5) {
         this.m = var3;
         this.W = var4;
         this.G = var5;
      }

      public int z() {
         return this.m;
      }

      public aq o() {
         return this.G;
      }

      public String toString() {
         return this.W;
      }

      public static gb.p c(int var0) {
         int[] var1 = g3.v.w();
         if(var0 < 0 || var0 >= n.length) {
            var0 = 0;
         }

         return n[var0];
      }

      public static gb.p b(aq var0, aq var1) {
         int[] var2 = g3.v.w();
         switch(null.n[var0.ordinal()]) {
         case 1:
            switch(null.h[var1.r().ordinal()]) {
            case 1:
               return DOWN_X;
            case 2:
               return DOWN_Z;
            default:
               throw new IllegalArgumentException(a(30332, 2656) + var1 + a(30335, 30730) + var0);
            }
         case 2:
            switch(null.h[var1.r().ordinal()]) {
            case 1:
               return UP_X;
            case 2:
               return UP_Z;
            default:
               throw new IllegalArgumentException(a(30324, 1289) + var1 + a(30320, 9030) + var0);
            }
         case 3:
            return NORTH;
         case 4:
            return SOUTH;
         case 5:
            return WEST;
         case 6:
            return EAST;
         default:
            throw new IllegalArgumentException(a(30327, -11288) + var0);
         }
      }

      public String f() {
         return this.W;
      }

      static {
         // $FF: Couldn't be decompiled
      }

      private static IllegalArgumentException a(IllegalArgumentException var0) {
         return var0;
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 30331) & '\uffff';
         if(b[var2] == null) {
            char[] var3 = a[var2].toCharArray();
            short var10000;
            switch(var3[0] & 255) {
            case 0:
               var10000 = 206;
               break;
            case 1:
               var10000 = 196;
               break;
            case 2:
               var10000 = 55;
               break;
            case 3:
               var10000 = 158;
               break;
            case 4:
               var10000 = 215;
               break;
            case 5:
               var10000 = 203;
               break;
            case 6:
               var10000 = 114;
               break;
            case 7:
               var10000 = 65;
               break;
            case 8:
               var10000 = 110;
               break;
            case 9:
               var10000 = 142;
               break;
            case 10:
               var10000 = 61;
               break;
            case 11:
               var10000 = 238;
               break;
            case 12:
               var10000 = 31;
               break;
            case 13:
               var10000 = 178;
               break;
            case 14:
               var10000 = 186;
               break;
            case 15:
               var10000 = 237;
               break;
            case 16:
               var10000 = 194;
               break;
            case 17:
               var10000 = 163;
               break;
            case 18:
               var10000 = 72;
               break;
            case 19:
               var10000 = 204;
               break;
            case 20:
               var10000 = 157;
               break;
            case 21:
               var10000 = 48;
               break;
            case 22:
               var10000 = 229;
               break;
            case 23:
               var10000 = 138;
               break;
            case 24:
               var10000 = 33;
               break;
            case 25:
               var10000 = 222;
               break;
            case 26:
               var10000 = 181;
               break;
            case 27:
               var10000 = 68;
               break;
            case 28:
               var10000 = 3;
               break;
            case 29:
               var10000 = 40;
               break;
            case 30:
               var10000 = 241;
               break;
            case 31:
               var10000 = 205;
               break;
            case 32:
               var10000 = 150;
               break;
            case 33:
               var10000 = 63;
               break;
            case 34:
               var10000 = 105;
               break;
            case 35:
               var10000 = 175;
               break;
            case 36:
               var10000 = 172;
               break;
            case 37:
               var10000 = 81;
               break;
            case 38:
               var10000 = 212;
               break;
            case 39:
               var10000 = 122;
               break;
            case 40:
               var10000 = 151;
               break;
            case 41:
               var10000 = 233;
               break;
            case 42:
               var10000 = 95;
               break;
            case 43:
               var10000 = 10;
               break;
            case 44:
               var10000 = 169;
               break;
            case 45:
               var10000 = 116;
               break;
            case 46:
               var10000 = 244;
               break;
            case 47:
               var10000 = 32;
               break;
            case 48:
               var10000 = 14;
               break;
            case 49:
               var10000 = 124;
               break;
            case 50:
               var10000 = 38;
               break;
            case 51:
               var10000 = 146;
               break;
            case 52:
               var10000 = 99;
               break;
            case 53:
               var10000 = 170;
               break;
            case 54:
               var10000 = 59;
               break;
            case 55:
               var10000 = 4;
               break;
            case 56:
               var10000 = 153;
               break;
            case 57:
               var10000 = 252;
               break;
            case 58:
               var10000 = 117;
               break;
            case 59:
               var10000 = 253;
               break;
            case 60:
               var10000 = 209;
               break;
            case 61:
               var10000 = 109;
               break;
            case 62:
               var10000 = 121;
               break;
            case 63:
               var10000 = 18;
               break;
            case 64:
               var10000 = 155;
               break;
            case 65:
               var10000 = 88;
               break;
            case 66:
               var10000 = 248;
               break;
            case 67:
               var10000 = 9;
               break;
            case 68:
               var10000 = 137;
               break;
            case 69:
               var10000 = 90;
               break;
            case 70:
               var10000 = 167;
               break;
            case 71:
               var10000 = 57;
               break;
            case 72:
               var10000 = 34;
               break;
            case 73:
               var10000 = 227;
               break;
            case 74:
               var10000 = 201;
               break;
            case 75:
               var10000 = 69;
               break;
            case 76:
               var10000 = 131;
               break;
            case 77:
               var10000 = 140;
               break;
            case 78:
               var10000 = 112;
               break;
            case 79:
               var10000 = 179;
               break;
            case 80:
               var10000 = 75;
               break;
            case 81:
               var10000 = 1;
               break;
            case 82:
               var10000 = 132;
               break;
            case 83:
               var10000 = 24;
               break;
            case 84:
               var10000 = 147;
               break;
            case 85:
               var10000 = 36;
               break;
            case 86:
               var10000 = 107;
               break;
            case 87:
               var10000 = 184;
               break;
            case 88:
               var10000 = 46;
               break;
            case 89:
               var10000 = 134;
               break;
            case 90:
               var10000 = 243;
               break;
            case 91:
               var10000 = 67;
               break;
            case 92:
               var10000 = 118;
               break;
            case 93:
               var10000 = 145;
               break;
            case 94:
               var10000 = 232;
               break;
            case 95:
               var10000 = 106;
               break;
            case 96:
               var10000 = 166;
               break;
            case 97:
               var10000 = 102;
               break;
            case 98:
               var10000 = 20;
               break;
            case 99:
               var10000 = 91;
               break;
            case 100:
               var10000 = 214;
               break;
            case 101:
               var10000 = 22;
               break;
            case 102:
               var10000 = 208;
               break;
            case 103:
               var10000 = 240;
               break;
            case 104:
               var10000 = 7;
               break;
            case 105:
               var10000 = 191;
               break;
            case 106:
               var10000 = 15;
               break;
            case 107:
               var10000 = 56;
               break;
            case 108:
               var10000 = 93;
               break;
            case 109:
               var10000 = 177;
               break;
            case 110:
               var10000 = 85;
               break;
            case 111:
               var10000 = 183;
               break;
            case 112:
               var10000 = 255;
               break;
            case 113:
               var10000 = 236;
               break;
            case 114:
               var10000 = 133;
               break;
            case 115:
               var10000 = 104;
               break;
            case 116:
               var10000 = 249;
               break;
            case 117:
               var10000 = 103;
               break;
            case 118:
               var10000 = 86;
               break;
            case 119:
               var10000 = 211;
               break;
            case 120:
               var10000 = 125;
               break;
            case 121:
               var10000 = 12;
               break;
            case 122:
               var10000 = 190;
               break;
            case 123:
               var10000 = 13;
               break;
            case 124:
               var10000 = 111;
               break;
            case 125:
               var10000 = 144;
               break;
            case 126:
               var10000 = 230;
               break;
            case 127:
               var10000 = 127;
               break;
            case 128:
               var10000 = 152;
               break;
            case 129:
               var10000 = 29;
               break;
            case 130:
               var10000 = 123;
               break;
            case 131:
               var10000 = 192;
               break;
            case 132:
               var10000 = 73;
               break;
            case 133:
               var10000 = 47;
               break;
            case 134:
               var10000 = 43;
               break;
            case 135:
               var10000 = 71;
               break;
            case 136:
               var10000 = 0;
               break;
            case 137:
               var10000 = 161;
               break;
            case 138:
               var10000 = 141;
               break;
            case 139:
               var10000 = 246;
               break;
            case 140:
               var10000 = 5;
               break;
            case 141:
               var10000 = 156;
               break;
            case 142:
               var10000 = 89;
               break;
            case 143:
               var10000 = 217;
               break;
            case 144:
               var10000 = 16;
               break;
            case 145:
               var10000 = 70;
               break;
            case 146:
               var10000 = 35;
               break;
            case 147:
               var10000 = 79;
               break;
            case 148:
               var10000 = 45;
               break;
            case 149:
               var10000 = 164;
               break;
            case 150:
               var10000 = 76;
               break;
            case 151:
               var10000 = 27;
               break;
            case 152:
               var10000 = 225;
               break;
            case 153:
               var10000 = 25;
               break;
            case 154:
               var10000 = 239;
               break;
            case 155:
               var10000 = 51;
               break;
            case 156:
               var10000 = 60;
               break;
            case 157:
               var10000 = 2;
               break;
            case 158:
               var10000 = 136;
               break;
            case 159:
               var10000 = 254;
               break;
            case 160:
               var10000 = 49;
               break;
            case 161:
               var10000 = 198;
               break;
            case 162:
               var10000 = 108;
               break;
            case 163:
               var10000 = 185;
               break;
            case 164:
               var10000 = 188;
               break;
            case 165:
               var10000 = 247;
               break;
            case 166:
               var10000 = 180;
               break;
            case 167:
               var10000 = 242;
               break;
            case 168:
               var10000 = 226;
               break;
            case 169:
               var10000 = 77;
               break;
            case 170:
               var10000 = 128;
               break;
            case 171:
               var10000 = 143;
               break;
            case 172:
               var10000 = 19;
               break;
            case 173:
               var10000 = 17;
               break;
            case 174:
               var10000 = 219;
               break;
            case 175:
               var10000 = 44;
               break;
            case 176:
               var10000 = 168;
               break;
            case 177:
               var10000 = 154;
               break;
            case 178:
               var10000 = 218;
               break;
            case 179:
               var10000 = 223;
               break;
            case 180:
               var10000 = 182;
               break;
            case 181:
               var10000 = 231;
               break;
            case 182:
               var10000 = 228;
               break;
            case 183:
               var10000 = 92;
               break;
            case 184:
               var10000 = 37;
               break;
            case 185:
               var10000 = 30;
               break;
            case 186:
               var10000 = 174;
               break;
            case 187:
               var10000 = 115;
               break;
            case 188:
               var10000 = 101;
               break;
            case 189:
               var10000 = 21;
               break;
            case 190:
               var10000 = 135;
               break;
            case 191:
               var10000 = 26;
               break;
            case 192:
               var10000 = 245;
               break;
            case 193:
               var10000 = 159;
               break;
            case 194:
               var10000 = 234;
               break;
            case 195:
               var10000 = 50;
               break;
            case 196:
               var10000 = 173;
               break;
            case 197:
               var10000 = 78;
               break;
            case 198:
               var10000 = 171;
               break;
            case 199:
               var10000 = 160;
               break;
            case 200:
               var10000 = 176;
               break;
            case 201:
               var10000 = 66;
               break;
            case 202:
               var10000 = 98;
               break;
            case 203:
               var10000 = 82;
               break;
            case 204:
               var10000 = 96;
               break;
            case 205:
               var10000 = 149;
               break;
            case 206:
               var10000 = 139;
               break;
            case 207:
               var10000 = 53;
               break;
            case 208:
               var10000 = 250;
               break;
            case 209:
               var10000 = 94;
               break;
            case 210:
               var10000 = 126;
               break;
            case 211:
               var10000 = 83;
               break;
            case 212:
               var10000 = 28;
               break;
            case 213:
               var10000 = 52;
               break;
            case 214:
               var10000 = 80;
               break;
            case 215:
               var10000 = 130;
               break;
            case 216:
               var10000 = 39;
               break;
            case 217:
               var10000 = 23;
               break;
            case 218:
               var10000 = 87;
               break;
            case 219:
               var10000 = 148;
               break;
            case 220:
               var10000 = 54;
               break;
            case 221:
               var10000 = 6;
               break;
            case 222:
               var10000 = 119;
               break;
            case 223:
               var10000 = 210;
               break;
            case 224:
               var10000 = 8;
               break;
            case 225:
               var10000 = 113;
               break;
            case 226:
               var10000 = 251;
               break;
            case 227:
               var10000 = 100;
               break;
            case 228:
               var10000 = 199;
               break;
            case 229:
               var10000 = 195;
               break;
            case 230:
               var10000 = 42;
               break;
            case 231:
               var10000 = 207;
               break;
            case 232:
               var10000 = 202;
               break;
            case 233:
               var10000 = 187;
               break;
            case 234:
               var10000 = 165;
               break;
            case 235:
               var10000 = 224;
               break;
            case 236:
               var10000 = 213;
               break;
            case 237:
               var10000 = 64;
               break;
            case 238:
               var10000 = 197;
               break;
            case 239:
               var10000 = 74;
               break;
            case 240:
               var10000 = 84;
               break;
            case 241:
               var10000 = 193;
               break;
            case 242:
               var10000 = 129;
               break;
            case 243:
               var10000 = 62;
               break;
            case 244:
               var10000 = 41;
               break;
            case 245:
               var10000 = 97;
               break;
            case 246:
               var10000 = 11;
               break;
            case 247:
               var10000 = 220;
               break;
            case 248:
               var10000 = 189;
               break;
            case 249:
               var10000 = 200;
               break;
            case 250:
               var10000 = 162;
               break;
            case 251:
               var10000 = 58;
               break;
            case 252:
               var10000 = 235;
               break;
            case 253:
               var10000 = 216;
               break;
            case 254:
               var10000 = 221;
               break;
            default:
               var10000 = 120;
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
   }
}
