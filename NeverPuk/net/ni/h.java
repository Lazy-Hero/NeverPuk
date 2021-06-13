package net.ni;

import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import net.b2;
import net.xn;
import net.n0.ks;
import net.n0.kw;
import net.ni.a;
import net.ni.w;
import net.y9.g_;
import net.yz.aq;

public class h extends a implements net.yz.i, net.nl.z {
   public static final net.n_.f[][] y;
   private static final Set P;
   private final List X = Lists.newArrayList();
   private long p;
   private float E;
   private boolean d;
   private int b = -1;
   @Nullable
   private net.n_.f g;
   @Nullable
   private net.n_.f G;
   private ks m = ks.a;
   private String z;
   private static final String[] c;
   private static final String[] e;

   public void m() {
      if(this.J.y() % 80L == 0L) {
         this.d();
      }

   }

   public void d() {
      if(this.J != null) {
         this.s();
         this.i();
      }

   }

   private void i() {
      if(this.d && this.b > 0 && !this.J.x && this.g != null) {
         double var1 = (double)(this.b * 10 + 10);
         byte var3 = 0;
         if(this.b >= 4 && this.g == this.G) {
            var3 = 1;
         }

         int var4 = (9 + this.b * 2) * 20;
         int var5 = this.S.t();
         int var6 = this.S.h();
         int var7 = this.S.y();
         net.u.e var8 = (new net.u.e((double)var5, (double)var6, (double)var7, (double)(var5 + 1), (double)(var6 + 1), (double)(var7 + 1))).x(var1).T(0.0D, (double)this.J.Z(), 0.0D);
         List var9 = this.J.p(net.r.r.class, var8);

         for(net.r.r var11 : var9) {
            var11.o((net.n_.i)(new net.n_.i(this.g, var4, var3, true, true)));
         }

         if(this.b >= 4 && this.g != this.G && this.G != null) {
            for(net.r.r var13 : var9) {
               var13.o((net.n_.i)(new net.n_.i(this.G, var4, 0, true, true)));
            }
         }
      }

   }

   private void s() {
      int var2 = this.S.t();
      w.C();
      int var3 = this.S.h();
      int var4 = this.S.y();
      int var5 = this.b;
      this.b = 0;
      this.X.clear();
      this.d = true;
      h.u var6 = new h.u(kw.WHITE.H());
      this.X.add(var6);
      boolean var7 = true;
      net.u.j var8 = new net.u.j();
      int var9 = var3 + 1;
      if(var9 < 256) {
         net.yw.n var10 = this.J.Z(var8.V(var2, var9, var4));
         if(var10.Q() == net.nb.f.T5) {
            float[] var11 = ((kw)var10.i(net.y9.e.D)).H();
         }

         if(var10.Q() != net.nb.f.J) {
            if(var10.K() >= 15 && var10.Q() != net.nb.f.T8) {
               this.d = false;
               this.X.clear();
            }

            var6.j();
         }

         float[] var23 = ((kw)var10.i(g_.H)).H();
         if(Arrays.equals(var23, var6.T())) {
            var6.j();
         }

         var6 = new h.u(var23);
         this.X.add(var6);
         var7 = false;
         ++var9;
      }

      if(this.d) {
         var9 = 1;
         int var21 = var3 - var9;
         if(var21 < 0) {
            ;
         }

         boolean var24 = true;
         int var12 = var2 - var9;
         if(var12 <= var2 + var9) {
            int var13 = var4 - var9;
            if(var13 <= var4 + var9) {
               net.y9.l var14 = this.J.Z(new net.u.j(var12, var21, var13)).Q();
               if(var14 != net.nb.f.du && var14 != net.nb.f.uW && var14 != net.nb.f.ud && var14 != net.nb.f.TE) {
                  var24 = false;
               }

               ++var13;
            }

            ++var12;
         }

         this.b = var9++;
         if(this.b == 0) {
            this.d = false;
         }
      }

      if(!this.J.x && var5 < this.b) {
         Iterator var20 = this.J.p(net.r.h.class, (new net.u.e((double)var2, (double)var3, (double)var4, (double)var2, (double)(var3 - 4), (double)var4)).f(10.0D, 5.0D, 10.0D)).iterator();
         if(var20.hasNext()) {
            net.r.h var22 = (net.r.h)var20.next();
            b2.G.U(var22, this);
         }
      }

   }

   public List r() {
      return this.X;
   }

   public float e() {
      if(!this.d) {
         return 0.0F;
      } else {
         int var1 = (int)(this.J.y() - this.p);
         this.p = this.J.y();
         if(var1 > 1) {
            this.E -= (float)var1 / 40.0F;
            if(this.E < 0.0F) {
               this.E = 0.0F;
            }
         }

         this.E += 0.025F;
         if(this.E > 1.0F) {
            this.E = 1.0F;
         }

         return this.E;
      }
   }

   public int w() {
      return this.b;
   }

   @Nullable
   public net.no.k q() {
      return new net.no.k(this.S, 3, this.e());
   }

   public net.nj.f e() {
      return this.b(new net.nj.f());
   }

   public double K() {
      return 65536.0D;
   }

   @Nullable
   private static net.n_.f i(int var0) {
      net.n_.f var1 = net.n_.f.Q(var0);
      return P.contains(var1)?var1:null;
   }

   public void G(net.nj.f var1) {
      super.G(var1);
      this.g = i(var1.P(b(3583, -7538)));
      this.G = i(var1.P(b(3578, -15699)));
      this.b = var1.P(b(3582, -31696));
   }

   public net.nj.f b(net.nj.f var1) {
      super.b(var1);
      var1.r(b(3579, -6352), net.n_.f.N(this.g));
      var1.r(b(3577, -13468), net.n_.f.N(this.G));
      var1.r(b(3580, 27415), this.b);
      return var1;
   }

   public int e() {
      return 1;
   }

   public boolean N() {
      return this.m.B();
   }

   public ks A(int var1) {
      return this.m;
   }

   public ks W(int var1, int var2) {
      if(!this.m.B()) {
         if(var2 >= this.m.U()) {
            ks var3 = this.m;
            this.m = ks.a;
            return var3;
         } else {
            return this.m.w(var2);
         }
      } else {
         return ks.a;
      }
   }

   public ks S(int var1) {
      ks var2 = this.m;
      this.m = ks.a;
      return var2;
   }

   public void S(int var1, ks var2) {
      this.m = var2;
   }

   public String Q() {
      return this.H()?this.z:b(3581, 28396);
   }

   public boolean H() {
      return this.z != null && !this.z.isEmpty();
   }

   public void o(String var1) {
      this.z = var1;
   }

   public int m() {
      return 1;
   }

   public boolean m(net.r.r var1) {
      return this.J.L(this.S) != this?false:var1.o((double)this.S.t() + 0.5D, (double)this.S.h() + 0.5D, (double)this.S.y() + 0.5D) <= 64.0D;
   }

   public void o(net.r.r var1) {
   }

   public void b(net.r.r var1) {
   }

   public boolean s(int var1, ks var2) {
      return var2.Z() == net.nb.j.WL || var2.Z() == net.nb.j.B || var2.Z() == net.nb.j.F || var2.Z() == net.nb.j.S1;
   }

   public String H() {
      return b(3576, -4605);
   }

   public net.nl.v A(net.r.i var1, net.r.r var2) {
      return new net.nl.y(var1, this);
   }

   public int e(int var1) {
      switch(var1) {
      case 0:
         return this.b;
      case 1:
         return net.n_.f.N(this.g);
      case 2:
         return net.n_.f.N(this.G);
      default:
         return 0;
      }
   }

   public void Z(int var1, int var2) {
      switch(var1) {
      case 0:
         this.b = var2;
         break;
      case 1:
         this.g = i(var2);
         break;
      case 2:
         this.G = i(var2);
      }

   }

   public int r() {
      return 3;
   }

   public void T() {
      this.m = ks.a;
   }

   public boolean q(int var1, int var2) {
      if(var1 == 1) {
         this.d();
         return true;
      } else {
         return super.q(var1, var2);
      }
   }

   public int[] e(aq var1) {
      return new int[0];
   }

   public boolean Q(int var1, ks var2, aq var3) {
      return false;
   }

   public boolean i(int var1, ks var2, aq var3) {
      return false;
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static xn a(xn var0) {
      return var0;
   }

   private static String b(int var0, int var1) {
      int var2 = (var0 ^ 3576) & '\uffff';
      if(e[var2] == null) {
         char[] var3 = c[var2].toCharArray();
         short var10000;
         switch(var3[0] & 255) {
         case 0:
            var10000 = 24;
            break;
         case 1:
            var10000 = 114;
            break;
         case 2:
            var10000 = 234;
            break;
         case 3:
            var10000 = 243;
            break;
         case 4:
            var10000 = 144;
            break;
         case 5:
            var10000 = 89;
            break;
         case 6:
            var10000 = 38;
            break;
         case 7:
            var10000 = 95;
            break;
         case 8:
            var10000 = 143;
            break;
         case 9:
            var10000 = 26;
            break;
         case 10:
            var10000 = 166;
            break;
         case 11:
            var10000 = 154;
            break;
         case 12:
            var10000 = 210;
            break;
         case 13:
            var10000 = 127;
            break;
         case 14:
            var10000 = 232;
            break;
         case 15:
            var10000 = 73;
            break;
         case 16:
            var10000 = 141;
            break;
         case 17:
            var10000 = 187;
            break;
         case 18:
            var10000 = 135;
            break;
         case 19:
            var10000 = 204;
            break;
         case 20:
            var10000 = 147;
            break;
         case 21:
            var10000 = 81;
            break;
         case 22:
            var10000 = 104;
            break;
         case 23:
            var10000 = 214;
            break;
         case 24:
            var10000 = 6;
            break;
         case 25:
            var10000 = 241;
            break;
         case 26:
            var10000 = 122;
            break;
         case 27:
            var10000 = 192;
            break;
         case 28:
            var10000 = 180;
            break;
         case 29:
            var10000 = 119;
            break;
         case 30:
            var10000 = 94;
            break;
         case 31:
            var10000 = 206;
            break;
         case 32:
            var10000 = 191;
            break;
         case 33:
            var10000 = 221;
            break;
         case 34:
            var10000 = 126;
            break;
         case 35:
            var10000 = 71;
            break;
         case 36:
            var10000 = 168;
            break;
         case 37:
            var10000 = 25;
            break;
         case 38:
            var10000 = 235;
            break;
         case 39:
            var10000 = 161;
            break;
         case 40:
            var10000 = 108;
            break;
         case 41:
            var10000 = 177;
            break;
         case 42:
            var10000 = 231;
            break;
         case 43:
            var10000 = 77;
            break;
         case 44:
            var10000 = 51;
            break;
         case 45:
            var10000 = 236;
            break;
         case 46:
            var10000 = 107;
            break;
         case 47:
            var10000 = 164;
            break;
         case 48:
            var10000 = 102;
            break;
         case 49:
            var10000 = 138;
            break;
         case 50:
            var10000 = 205;
            break;
         case 51:
            var10000 = 247;
            break;
         case 52:
            var10000 = 10;
            break;
         case 53:
            var10000 = 193;
            break;
         case 54:
            var10000 = 3;
            break;
         case 55:
            var10000 = 27;
            break;
         case 56:
            var10000 = 255;
            break;
         case 57:
            var10000 = 33;
            break;
         case 58:
            var10000 = 132;
            break;
         case 59:
            var10000 = 211;
            break;
         case 60:
            var10000 = 39;
            break;
         case 61:
            var10000 = 56;
            break;
         case 62:
            var10000 = 227;
            break;
         case 63:
            var10000 = 99;
            break;
         case 64:
            var10000 = 115;
            break;
         case 65:
            var10000 = 74;
            break;
         case 66:
            var10000 = 79;
            break;
         case 67:
            var10000 = 186;
            break;
         case 68:
            var10000 = 157;
            break;
         case 69:
            var10000 = 40;
            break;
         case 70:
            var10000 = 52;
            break;
         case 71:
            var10000 = 86;
            break;
         case 72:
            var10000 = 65;
            break;
         case 73:
            var10000 = 169;
            break;
         case 74:
            var10000 = 216;
            break;
         case 75:
            var10000 = 76;
            break;
         case 76:
            var10000 = 129;
            break;
         case 77:
            var10000 = 152;
            break;
         case 78:
            var10000 = 19;
            break;
         case 79:
            var10000 = 32;
            break;
         case 80:
            var10000 = 110;
            break;
         case 81:
            var10000 = 16;
            break;
         case 82:
            var10000 = 245;
            break;
         case 83:
            var10000 = 78;
            break;
         case 84:
            var10000 = 151;
            break;
         case 85:
            var10000 = 106;
            break;
         case 86:
            var10000 = 183;
            break;
         case 87:
            var10000 = 118;
            break;
         case 88:
            var10000 = 134;
            break;
         case 89:
            var10000 = 45;
            break;
         case 90:
            var10000 = 12;
            break;
         case 91:
            var10000 = 93;
            break;
         case 92:
            var10000 = 160;
            break;
         case 93:
            var10000 = 178;
            break;
         case 94:
            var10000 = 212;
            break;
         case 95:
            var10000 = 176;
            break;
         case 96:
            var10000 = 237;
            break;
         case 97:
            var10000 = 34;
            break;
         case 98:
            var10000 = 148;
            break;
         case 99:
            var10000 = 91;
            break;
         case 100:
            var10000 = 62;
            break;
         case 101:
            var10000 = 201;
            break;
         case 102:
            var10000 = 111;
            break;
         case 103:
            var10000 = 0;
            break;
         case 104:
            var10000 = 64;
            break;
         case 105:
            var10000 = 31;
            break;
         case 106:
            var10000 = 88;
            break;
         case 107:
            var10000 = 218;
            break;
         case 108:
            var10000 = 184;
            break;
         case 109:
            var10000 = 170;
            break;
         case 110:
            var10000 = 174;
            break;
         case 111:
            var10000 = 150;
            break;
         case 112:
            var10000 = 250;
            break;
         case 113:
            var10000 = 146;
            break;
         case 114:
            var10000 = 179;
            break;
         case 115:
            var10000 = 207;
            break;
         case 116:
            var10000 = 124;
            break;
         case 117:
            var10000 = 17;
            break;
         case 118:
            var10000 = 137;
            break;
         case 119:
            var10000 = 252;
            break;
         case 120:
            var10000 = 84;
            break;
         case 121:
            var10000 = 248;
            break;
         case 122:
            var10000 = 60;
            break;
         case 123:
            var10000 = 249;
            break;
         case 124:
            var10000 = 240;
            break;
         case 125:
            var10000 = 22;
            break;
         case 126:
            var10000 = 42;
            break;
         case 127:
            var10000 = 116;
            break;
         case 128:
            var10000 = 7;
            break;
         case 129:
            var10000 = 125;
            break;
         case 130:
            var10000 = 54;
            break;
         case 131:
            var10000 = 30;
            break;
         case 132:
            var10000 = 29;
            break;
         case 133:
            var10000 = 145;
            break;
         case 134:
            var10000 = 96;
            break;
         case 135:
            var10000 = 149;
            break;
         case 136:
            var10000 = 55;
            break;
         case 137:
            var10000 = 162;
            break;
         case 138:
            var10000 = 188;
            break;
         case 139:
            var10000 = 128;
            break;
         case 140:
            var10000 = 67;
            break;
         case 141:
            var10000 = 18;
            break;
         case 142:
            var10000 = 70;
            break;
         case 143:
            var10000 = 83;
            break;
         case 144:
            var10000 = 253;
            break;
         case 145:
            var10000 = 112;
            break;
         case 146:
            var10000 = 120;
            break;
         case 147:
            var10000 = 36;
            break;
         case 148:
            var10000 = 209;
            break;
         case 149:
            var10000 = 100;
            break;
         case 150:
            var10000 = 153;
            break;
         case 151:
            var10000 = 159;
            break;
         case 152:
            var10000 = 181;
            break;
         case 153:
            var10000 = 80;
            break;
         case 154:
            var10000 = 254;
            break;
         case 155:
            var10000 = 238;
            break;
         case 156:
            var10000 = 230;
            break;
         case 157:
            var10000 = 82;
            break;
         case 158:
            var10000 = 9;
            break;
         case 159:
            var10000 = 158;
            break;
         case 160:
            var10000 = 1;
            break;
         case 161:
            var10000 = 225;
            break;
         case 162:
            var10000 = 189;
            break;
         case 163:
            var10000 = 49;
            break;
         case 164:
            var10000 = 194;
            break;
         case 165:
            var10000 = 198;
            break;
         case 166:
            var10000 = 217;
            break;
         case 167:
            var10000 = 63;
            break;
         case 168:
            var10000 = 199;
            break;
         case 169:
            var10000 = 239;
            break;
         case 170:
            var10000 = 173;
            break;
         case 171:
            var10000 = 224;
            break;
         case 172:
            var10000 = 61;
            break;
         case 173:
            var10000 = 142;
            break;
         case 174:
            var10000 = 72;
            break;
         case 175:
            var10000 = 98;
            break;
         case 176:
            var10000 = 197;
            break;
         case 177:
            var10000 = 167;
            break;
         case 178:
            var10000 = 13;
            break;
         case 179:
            var10000 = 75;
            break;
         case 180:
            var10000 = 59;
            break;
         case 181:
            var10000 = 172;
            break;
         case 182:
            var10000 = 92;
            break;
         case 183:
            var10000 = 246;
            break;
         case 184:
            var10000 = 21;
            break;
         case 185:
            var10000 = 226;
            break;
         case 186:
            var10000 = 175;
            break;
         case 187:
            var10000 = 105;
            break;
         case 188:
            var10000 = 171;
            break;
         case 189:
            var10000 = 37;
            break;
         case 190:
            var10000 = 28;
            break;
         case 191:
            var10000 = 228;
            break;
         case 192:
            var10000 = 11;
            break;
         case 193:
            var10000 = 202;
            break;
         case 194:
            var10000 = 213;
            break;
         case 195:
            var10000 = 109;
            break;
         case 196:
            var10000 = 156;
            break;
         case 197:
            var10000 = 46;
            break;
         case 198:
            var10000 = 90;
            break;
         case 199:
            var10000 = 23;
            break;
         case 200:
            var10000 = 182;
            break;
         case 201:
            var10000 = 44;
            break;
         case 202:
            var10000 = 139;
            break;
         case 203:
            var10000 = 203;
            break;
         case 204:
            var10000 = 223;
            break;
         case 205:
            var10000 = 251;
            break;
         case 206:
            var10000 = 136;
            break;
         case 207:
            var10000 = 97;
            break;
         case 208:
            var10000 = 130;
            break;
         case 209:
            var10000 = 229;
            break;
         case 210:
            var10000 = 117;
            break;
         case 211:
            var10000 = 103;
            break;
         case 212:
            var10000 = 208;
            break;
         case 213:
            var10000 = 242;
            break;
         case 214:
            var10000 = 200;
            break;
         case 215:
            var10000 = 244;
            break;
         case 216:
            var10000 = 14;
            break;
         case 217:
            var10000 = 87;
            break;
         case 218:
            var10000 = 15;
            break;
         case 219:
            var10000 = 165;
            break;
         case 220:
            var10000 = 113;
            break;
         case 221:
            var10000 = 155;
            break;
         case 222:
            var10000 = 133;
            break;
         case 223:
            var10000 = 66;
            break;
         case 224:
            var10000 = 69;
            break;
         case 225:
            var10000 = 4;
            break;
         case 226:
            var10000 = 8;
            break;
         case 227:
            var10000 = 5;
            break;
         case 228:
            var10000 = 48;
            break;
         case 229:
            var10000 = 47;
            break;
         case 230:
            var10000 = 101;
            break;
         case 231:
            var10000 = 196;
            break;
         case 232:
            var10000 = 185;
            break;
         case 233:
            var10000 = 131;
            break;
         case 234:
            var10000 = 222;
            break;
         case 235:
            var10000 = 53;
            break;
         case 236:
            var10000 = 163;
            break;
         case 237:
            var10000 = 190;
            break;
         case 238:
            var10000 = 195;
            break;
         case 239:
            var10000 = 123;
            break;
         case 240:
            var10000 = 140;
            break;
         case 241:
            var10000 = 50;
            break;
         case 242:
            var10000 = 2;
            break;
         case 243:
            var10000 = 85;
            break;
         case 244:
            var10000 = 57;
            break;
         case 245:
            var10000 = 233;
            break;
         case 246:
            var10000 = 219;
            break;
         case 247:
            var10000 = 220;
            break;
         case 248:
            var10000 = 43;
            break;
         case 249:
            var10000 = 121;
            break;
         case 250:
            var10000 = 58;
            break;
         case 251:
            var10000 = 68;
            break;
         case 252:
            var10000 = 35;
            break;
         case 253:
            var10000 = 20;
            break;
         case 254:
            var10000 = 41;
            break;
         default:
            var10000 = 215;
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

         e[var2] = (new String(var3)).intern();
      }

      return e[var2];
   }

   public static class u {
      private final float[] Z;
      private int V;

      public u(float[] var1) {
         this.Z = var1;
         this.V = 1;
      }

      protected void j() {
         ++this.V;
      }

      public float[] T() {
         return this.Z;
      }

      public int y() {
         return this.V;
      }
   }
}
