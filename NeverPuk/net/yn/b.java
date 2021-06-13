package net.yn;

import java.util.Map;
import java.util.Random;
import javax.annotation.Nullable;
import net.xn;
import net.n0.ks;
import net.n0.kw;
import net.nl.ze;
import net.y_.o6;
import net.y_.oa;
import net.y_.ok;
import net.y_.op;
import net.y_.ot;
import net.y_.ow;
import net.y_.oy;
import net.yn.w;
import net.yz.m_;

public class b extends w {
   private static final net.k.v Ul;
   private final ze U2 = new ze(new net.nl.v() {
      public boolean N(net.r.r var1) {
         return false;
      }
   }, 2, 1);
   private static final Map Uv;
   private int UL;
   private net.y_.q UN;
   private static final String[] lb;
   private static final String[] mb;

   private static float[] D(kw var0) {
      float[] var1 = var0.H();
      float var10000 = 0.75F;
      return new float[]{var1[0] * 0.75F, var1[1] * 0.75F, var1[2] * 0.75F};
   }

   public static float[] f(kw var0) {
      return (float[])Uv.get(var0);
   }

   public b(net.yv.r var1) {
      super(var1);
      this.S(0.9F, 1.3F);
      this.U2.S(0, new ks(net.nb.j.n));
      this.U2.S(1, new ks(net.nb.j.n));
   }

   protected void D() {
      this.UN = new net.y_.q(this);
      this.p_.X(0, new op(this));
      this.p_.X(1, new oy(this, 1.25D));
      this.p_.X(2, new ot(this, 1.0D));
      this.p_.X(3, new o6(this, 1.1D, net.nb.j.Sd, false));
      this.p_.X(4, new net.y_.h(this, 1.1D));
      this.p_.X(5, this.UN);
      this.p_.X(6, new ow(this, 1.0D));
      this.p_.X(7, new ok(this, net.r.r.class, 6.0F));
      this.p_.X(8, new oa(this));
   }

   protected void T() {
      this.UL = this.UN.i();
      super.T();
   }

   public void d() {
      if(this.hl.x) {
         this.UL = Math.max(0, this.UL - 1);
      }

      super.d();
   }

   protected void W() {
      super.W();
      this.t(net.ne.d.C).t(8.0D);
      this.t(net.ne.d.G).t(0.23000000417232513D);
   }

   protected void g() {
      super.g();
      this.G.r(Ul, Byte.valueOf((byte)0));
   }

   @Nullable
   protected m_ N() {
      if(this.D()) {
         return net.y7.p.pH;
      } else {
         switch(null.k[this.n().ordinal()]) {
         case 1:
         default:
            return net.y7.p.A;
         case 2:
            return net.y7.p.I;
         case 3:
            return net.y7.p.px;
         case 4:
            return net.y7.p.O;
         case 5:
            return net.y7.p.r;
         case 6:
            return net.y7.p.p6;
         case 7:
            return net.y7.p.pg;
         case 8:
            return net.y7.p.pZ;
         case 9:
            return net.y7.p.G;
         case 10:
            return net.y7.p.j;
         case 11:
            return net.y7.p.B;
         case 12:
            return net.y7.p.p2;
         case 13:
            return net.y7.p.f;
         case 14:
            return net.y7.p.p_;
         case 15:
            return net.y7.p.pp;
         case 16:
            return net.y7.p.z;
         }
      }
   }

   public void R(byte var1) {
      if(var1 == 10) {
         this.UL = 40;
      } else {
         super.R(var1);
      }

   }

   public float I(float var1) {
      return this.UL <= 0?0.0F:(this.UL >= 4 && this.UL <= 36?1.0F:(this.UL < 4?((float)this.UL - var1) / 4.0F:-((float)(this.UL - 40) - var1) / 4.0F));
   }

   public float c(float var1) {
      if(this.UL > 4 && this.UL <= 36) {
         float var2 = ((float)(this.UL - 4) - var1) / 32.0F;
         return 0.62831855F + 0.2199115F * net.u.t.A(var2 * 28.7F);
      } else {
         return this.UL > 0?0.62831855F:this.V * 0.017453292F;
      }
   }

   public boolean R(net.r.r var1, net.yz.k var2) {
      net.yn.z.B();
      ks var4 = var1.o((net.yz.k)var2);
      if(var4.Z() == net.nb.j.W5 && !this.D() && !this.H9()) {
         if(!this.hl.x) {
            this.l(true);
            int var5 = 1 + this.p.nextInt(3);
            int var6 = 0;
            if(var6 < var5) {
               net.nm.i var7 = this.O(new ks(net.n0.y.q(net.nb.f.ur), 1, this.n().d()), 1.0F);
               var7.K += (double)(this.p.nextFloat() * 0.05F);
               var7.hf += (double)((this.p.nextFloat() - this.p.nextFloat()) * 0.1F);
               var7.J += (double)((this.p.nextFloat() - this.p.nextFloat()) * 0.1F);
               ++var6;
            }
         }

         var4.S(1, var1);
         this.I(net.nb.l.oo, 1.0F, 1.0F);
      }

      return super.R(var1, var2);
   }

   public static void R(net.c0.d var0) {
      net.ne.y.J(var0, b.class);
   }

   public void I(net.nj.f var1) {
      super.I(var1);
      var1.c(f(8694, 25270), this.D());
      var1.D(f(8693, -26737), (byte)this.n().d());
   }

   public void o(net.nj.f var1) {
      super.o(var1);
      this.l(var1.i(f(8692, 9143)));
      this.S(kw.h(var1.R(f(8695, 27287))));
   }

   protected net.yz.a T() {
      return net.nb.l.Kt;
   }

   protected net.yz.a m(net.yz.z var1) {
      return net.nb.l.KG;
   }

   protected net.yz.a r() {
      return net.nb.l.wc;
   }

   protected void B(net.u.j var1, net.y9.l var2) {
      this.I(net.nb.l.Dz, 0.15F, 1.0F);
   }

   public kw n() {
      return kw.h(((Byte)this.G.a(Ul)).byteValue() & 15);
   }

   public void S(kw var1) {
      byte var2 = ((Byte)this.G.a(Ul)).byteValue();
      this.G.d(Ul, Byte.valueOf((byte)(var2 & 240 | var1.d() & 15)));
   }

   public boolean D() {
      return (((Byte)this.G.a(Ul)).byteValue() & 16) != 0;
   }

   public void l(boolean var1) {
      byte var2 = ((Byte)this.G.a(Ul)).byteValue();
      this.G.d(Ul, Byte.valueOf((byte)(var2 | 16)));
   }

   public static kw t(Random var0) {
      int var1 = var0.nextInt(100);
      return var1 < 5?kw.BLACK:(var1 < 10?kw.GRAY:(var1 < 15?kw.SILVER:(var1 < 18?kw.BROWN:(var0.nextInt(500) == 0?kw.PINK:kw.WHITE))));
   }

   public b G(net.ne.j var1) {
      b var2 = (b)var1;
      b var3 = new b(this.hl);
      var3.S(this.K(this, var2));
      return var3;
   }

   public void l() {
      this.l(false);
      if(this.H9()) {
         this.Q(60);
      }

   }

   @Nullable
   public net.ne.g t(net.yv.g var1, @Nullable net.ne.g var2) {
      var2 = super.t(var1, var2);
      this.S(t(this.hl.G));
      return var2;
   }

   private kw K(w var1, w var2) {
      int var3 = ((b)var1).n().G();
      int var4 = ((b)var2).n().G();
      this.U2.A(0).d(var3);
      this.U2.A(1).d(var4);
      ks var5 = net.cr.n.d(this.U2, var1.hl);
      int var6;
      if(var5.Z() == net.nb.j.n) {
         var6 = var5.n();
      } else {
         var6 = this.hl.G.nextBoolean()?var3:var4;
      }

      return kw.q(var6);
   }

   public float A() {
      return 0.95F * this.m;
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static xn d(xn var0) {
      return var0;
   }

   private static String f(int var0, int var1) {
      int var2 = (var0 ^ 8694) & '\uffff';
      if(mb[var2] == null) {
         char[] var3 = lb[var2].toCharArray();
         short var10000;
         switch(var3[0] & 255) {
         case 0:
            var10000 = 170;
            break;
         case 1:
            var10000 = 82;
            break;
         case 2:
            var10000 = 30;
            break;
         case 3:
            var10000 = 251;
            break;
         case 4:
            var10000 = 52;
            break;
         case 5:
            var10000 = 152;
            break;
         case 6:
            var10000 = 253;
            break;
         case 7:
            var10000 = 69;
            break;
         case 8:
            var10000 = 165;
            break;
         case 9:
            var10000 = 115;
            break;
         case 10:
            var10000 = 151;
            break;
         case 11:
            var10000 = 226;
            break;
         case 12:
            var10000 = 48;
            break;
         case 13:
            var10000 = 28;
            break;
         case 14:
            var10000 = 221;
            break;
         case 15:
            var10000 = 238;
            break;
         case 16:
            var10000 = 63;
            break;
         case 17:
            var10000 = 110;
            break;
         case 18:
            var10000 = 26;
            break;
         case 19:
            var10000 = 228;
            break;
         case 20:
            var10000 = 236;
            break;
         case 21:
            var10000 = 45;
            break;
         case 22:
            var10000 = 15;
            break;
         case 23:
            var10000 = 5;
            break;
         case 24:
            var10000 = 119;
            break;
         case 25:
            var10000 = 50;
            break;
         case 26:
            var10000 = 53;
            break;
         case 27:
            var10000 = 219;
            break;
         case 28:
            var10000 = 11;
            break;
         case 29:
            var10000 = 233;
            break;
         case 30:
            var10000 = 58;
            break;
         case 31:
            var10000 = 106;
            break;
         case 32:
            var10000 = 173;
            break;
         case 33:
            var10000 = 31;
            break;
         case 34:
            var10000 = 111;
            break;
         case 35:
            var10000 = 138;
            break;
         case 36:
            var10000 = 174;
            break;
         case 37:
            var10000 = 210;
            break;
         case 38:
            var10000 = 246;
            break;
         case 39:
            var10000 = 43;
            break;
         case 40:
            var10000 = 36;
            break;
         case 41:
            var10000 = 60;
            break;
         case 42:
            var10000 = 9;
            break;
         case 43:
            var10000 = 70;
            break;
         case 44:
            var10000 = 46;
            break;
         case 45:
            var10000 = 171;
            break;
         case 46:
            var10000 = 148;
            break;
         case 47:
            var10000 = 100;
            break;
         case 48:
            var10000 = 136;
            break;
         case 49:
            var10000 = 67;
            break;
         case 50:
            var10000 = 61;
            break;
         case 51:
            var10000 = 92;
            break;
         case 52:
            var10000 = 129;
            break;
         case 53:
            var10000 = 155;
            break;
         case 54:
            var10000 = 94;
            break;
         case 55:
            var10000 = 164;
            break;
         case 56:
            var10000 = 250;
            break;
         case 57:
            var10000 = 109;
            break;
         case 58:
            var10000 = 131;
            break;
         case 59:
            var10000 = 213;
            break;
         case 60:
            var10000 = 95;
            break;
         case 61:
            var10000 = 17;
            break;
         case 62:
            var10000 = 169;
            break;
         case 63:
            var10000 = 208;
            break;
         case 64:
            var10000 = 209;
            break;
         case 65:
            var10000 = 194;
            break;
         case 66:
            var10000 = 182;
            break;
         case 67:
            var10000 = 144;
            break;
         case 68:
            var10000 = 25;
            break;
         case 69:
            var10000 = 123;
            break;
         case 70:
            var10000 = 168;
            break;
         case 71:
            var10000 = 237;
            break;
         case 72:
            var10000 = 254;
            break;
         case 73:
            var10000 = 113;
            break;
         case 74:
            var10000 = 87;
            break;
         case 75:
            var10000 = 159;
            break;
         case 76:
            var10000 = 128;
            break;
         case 77:
            var10000 = 184;
            break;
         case 78:
            var10000 = 0;
            break;
         case 79:
            var10000 = 114;
            break;
         case 80:
            var10000 = 241;
            break;
         case 81:
            var10000 = 8;
            break;
         case 82:
            var10000 = 185;
            break;
         case 83:
            var10000 = 99;
            break;
         case 84:
            var10000 = 248;
            break;
         case 85:
            var10000 = 37;
            break;
         case 86:
            var10000 = 192;
            break;
         case 87:
            var10000 = 193;
            break;
         case 88:
            var10000 = 231;
            break;
         case 89:
            var10000 = 223;
            break;
         case 90:
            var10000 = 229;
            break;
         case 91:
            var10000 = 59;
            break;
         case 92:
            var10000 = 91;
            break;
         case 93:
            var10000 = 51;
            break;
         case 94:
            var10000 = 98;
            break;
         case 95:
            var10000 = 22;
            break;
         case 96:
            var10000 = 32;
            break;
         case 97:
            var10000 = 217;
            break;
         case 98:
            var10000 = 158;
            break;
         case 99:
            var10000 = 14;
            break;
         case 100:
            var10000 = 4;
            break;
         case 101:
            var10000 = 84;
            break;
         case 102:
            var10000 = 54;
            break;
         case 103:
            var10000 = 81;
            break;
         case 104:
            var10000 = 141;
            break;
         case 105:
            var10000 = 86;
            break;
         case 106:
            var10000 = 180;
            break;
         case 107:
            var10000 = 49;
            break;
         case 108:
            var10000 = 134;
            break;
         case 109:
            var10000 = 140;
            break;
         case 110:
            var10000 = 163;
            break;
         case 111:
            var10000 = 96;
            break;
         case 112:
            var10000 = 38;
            break;
         case 113:
            var10000 = 214;
            break;
         case 114:
            var10000 = 196;
            break;
         case 115:
            var10000 = 133;
            break;
         case 116:
            var10000 = 187;
            break;
         case 117:
            var10000 = 166;
            break;
         case 118:
            var10000 = 80;
            break;
         case 119:
            var10000 = 197;
            break;
         case 120:
            var10000 = 201;
            break;
         case 121:
            var10000 = 1;
            break;
         case 122:
            var10000 = 252;
            break;
         case 123:
            var10000 = 157;
            break;
         case 124:
            var10000 = 172;
            break;
         case 125:
            var10000 = 75;
            break;
         case 126:
            var10000 = 179;
            break;
         case 127:
            var10000 = 65;
            break;
         case 128:
            var10000 = 118;
            break;
         case 129:
            var10000 = 121;
            break;
         case 130:
            var10000 = 195;
            break;
         case 131:
            var10000 = 78;
            break;
         case 132:
            var10000 = 244;
            break;
         case 133:
            var10000 = 181;
            break;
         case 134:
            var10000 = 216;
            break;
         case 135:
            var10000 = 126;
            break;
         case 136:
            var10000 = 13;
            break;
         case 137:
            var10000 = 178;
            break;
         case 138:
            var10000 = 202;
            break;
         case 139:
            var10000 = 105;
            break;
         case 140:
            var10000 = 235;
            break;
         case 141:
            var10000 = 198;
            break;
         case 142:
            var10000 = 20;
            break;
         case 143:
            var10000 = 42;
            break;
         case 144:
            var10000 = 64;
            break;
         case 145:
            var10000 = 161;
            break;
         case 146:
            var10000 = 122;
            break;
         case 147:
            var10000 = 34;
            break;
         case 148:
            var10000 = 3;
            break;
         case 149:
            var10000 = 255;
            break;
         case 150:
            var10000 = 190;
            break;
         case 151:
            var10000 = 188;
            break;
         case 152:
            var10000 = 204;
            break;
         case 153:
            var10000 = 90;
            break;
         case 154:
            var10000 = 143;
            break;
         case 155:
            var10000 = 12;
            break;
         case 156:
            var10000 = 76;
            break;
         case 157:
            var10000 = 107;
            break;
         case 158:
            var10000 = 199;
            break;
         case 159:
            var10000 = 116;
            break;
         case 160:
            var10000 = 135;
            break;
         case 161:
            var10000 = 245;
            break;
         case 162:
            var10000 = 23;
            break;
         case 163:
            var10000 = 24;
            break;
         case 164:
            var10000 = 227;
            break;
         case 165:
            var10000 = 206;
            break;
         case 166:
            var10000 = 243;
            break;
         case 167:
            var10000 = 153;
            break;
         case 168:
            var10000 = 212;
            break;
         case 169:
            var10000 = 234;
            break;
         case 170:
            var10000 = 215;
            break;
         case 171:
            var10000 = 39;
            break;
         case 172:
            var10000 = 27;
            break;
         case 173:
            var10000 = 71;
            break;
         case 174:
            var10000 = 211;
            break;
         case 175:
            var10000 = 132;
            break;
         case 176:
            var10000 = 189;
            break;
         case 177:
            var10000 = 177;
            break;
         case 178:
            var10000 = 142;
            break;
         case 179:
            var10000 = 130;
            break;
         case 180:
            var10000 = 57;
            break;
         case 181:
            var10000 = 68;
            break;
         case 182:
            var10000 = 2;
            break;
         case 183:
            var10000 = 160;
            break;
         case 184:
            var10000 = 225;
            break;
         case 185:
            var10000 = 79;
            break;
         case 186:
            var10000 = 7;
            break;
         case 187:
            var10000 = 220;
            break;
         case 188:
            var10000 = 247;
            break;
         case 189:
            var10000 = 104;
            break;
         case 190:
            var10000 = 93;
            break;
         case 191:
            var10000 = 232;
            break;
         case 192:
            var10000 = 47;
            break;
         case 193:
            var10000 = 29;
            break;
         case 194:
            var10000 = 137;
            break;
         case 195:
            var10000 = 218;
            break;
         case 196:
            var10000 = 10;
            break;
         case 197:
            var10000 = 154;
            break;
         case 198:
            var10000 = 44;
            break;
         case 199:
            var10000 = 89;
            break;
         case 200:
            var10000 = 21;
            break;
         case 201:
            var10000 = 222;
            break;
         case 202:
            var10000 = 167;
            break;
         case 203:
            var10000 = 230;
            break;
         case 204:
            var10000 = 56;
            break;
         case 205:
            var10000 = 102;
            break;
         case 206:
            var10000 = 146;
            break;
         case 207:
            var10000 = 16;
            break;
         case 208:
            var10000 = 205;
            break;
         case 209:
            var10000 = 147;
            break;
         case 210:
            var10000 = 117;
            break;
         case 211:
            var10000 = 19;
            break;
         case 212:
            var10000 = 176;
            break;
         case 213:
            var10000 = 41;
            break;
         case 214:
            var10000 = 183;
            break;
         case 215:
            var10000 = 108;
            break;
         case 216:
            var10000 = 85;
            break;
         case 217:
            var10000 = 103;
            break;
         case 218:
            var10000 = 40;
            break;
         case 219:
            var10000 = 240;
            break;
         case 220:
            var10000 = 35;
            break;
         case 221:
            var10000 = 207;
            break;
         case 222:
            var10000 = 200;
            break;
         case 223:
            var10000 = 33;
            break;
         case 224:
            var10000 = 186;
            break;
         case 225:
            var10000 = 127;
            break;
         case 226:
            var10000 = 191;
            break;
         case 227:
            var10000 = 55;
            break;
         case 228:
            var10000 = 120;
            break;
         case 229:
            var10000 = 156;
            break;
         case 230:
            var10000 = 97;
            break;
         case 231:
            var10000 = 249;
            break;
         case 232:
            var10000 = 145;
            break;
         case 233:
            var10000 = 72;
            break;
         case 234:
            var10000 = 77;
            break;
         case 235:
            var10000 = 162;
            break;
         case 236:
            var10000 = 66;
            break;
         case 237:
            var10000 = 203;
            break;
         case 238:
            var10000 = 73;
            break;
         case 239:
            var10000 = 62;
            break;
         case 240:
            var10000 = 124;
            break;
         case 241:
            var10000 = 6;
            break;
         case 242:
            var10000 = 139;
            break;
         case 243:
            var10000 = 150;
            break;
         case 244:
            var10000 = 83;
            break;
         case 245:
            var10000 = 239;
            break;
         case 246:
            var10000 = 149;
            break;
         case 247:
            var10000 = 224;
            break;
         case 248:
            var10000 = 74;
            break;
         case 249:
            var10000 = 125;
            break;
         case 250:
            var10000 = 242;
            break;
         case 251:
            var10000 = 88;
            break;
         case 252:
            var10000 = 101;
            break;
         case 253:
            var10000 = 112;
            break;
         case 254:
            var10000 = 18;
            break;
         default:
            var10000 = 175;
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

         mb[var2] = (new String(var3)).intern();
      }

      return mb[var2];
   }
}
