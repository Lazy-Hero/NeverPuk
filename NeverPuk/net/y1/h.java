package net.y1;

import net.n0.kw;
import net.u.d;
import net.y1.v;

public class h {
   public static final h[] n = new h[64];
   public static final h[] P = new h[16];
   public static final h d = new h(0, 0);
   public static final h m = new h(1, 8368696);
   public static final h g = new h(2, 16247203);
   public static final h U = new h(3, 13092807);
   public static final h O = new h(4, 16711680);
   public static final h A = new h(5, 10526975);
   public static final h TB = new h(6, 10987431);
   public static final h G = new h(7, 31744);
   public static final h R = new h(8, 16777215);
   public static final h k = new h(9, 10791096);
   public static final h W = new h(10, 9923917);
   public static final h q = new h(11, 7368816);
   public static final h y = new h(12, 4210943);
   public static final h C = new h(13, 9402184);
   public static final h K = new h(14, 16776437);
   public static final h p = new h(15, 14188339);
   public static final h h = new h(16, 11685080);
   public static final h TL = new h(17, 6724056);
   public static final h Tr = new h(18, 15066419);
   public static final h z = new h(19, 8375321);
   public static final h e = new h(20, 15892389);
   public static final h b = new h(21, 5000268);
   public static final h Z = new h(22, 10066329);
   public static final h f = new h(23, 5013401);
   public static final h Q = new h(24, 8339378);
   public static final h H = new h(25, 3361970);
   public static final h o = new h(26, 6704179);
   public static final h D = new h(27, 6717235);
   public static final h j = new h(28, 10040115);
   public static final h c = new h(29, 1644825);
   public static final h s = new h(30, 16445005);
   public static final h r = new h(31, 6085589);
   public static final h a = new h(32, 4882687);
   public static final h B = new h(33, '\ud93a');
   public static final h J = new h(34, 8476209);
   public static final h M = new h(35, 7340544);
   public static final h V = new h(36, 13742497);
   public static final h S = new h(37, 10441252);
   public static final h N = new h(38, 9787244);
   public static final h Tm = new h(39, 7367818);
   public static final h u = new h(40, 12223780);
   public static final h i = new h(41, 6780213);
   public static final h t = new h(42, 10505550);
   public static final h Y = new h(43, 3746083);
   public static final h T = new h(44, 8874850);
   public static final h w = new h(45, 5725276);
   public static final h l = new h(46, 8014168);
   public static final h X = new h(47, 4996700);
   public static final h E = new h(48, 4993571);
   public static final h x = new h(49, 5001770);
   public static final h F = new h(50, 9321518);
   public static final h I = new h(51, 2430480);
   public int L;
   public final int v;

   private h(int var1, int var2) {
      if(var1 <= 63) {
         this.v = var1;
         this.L = var2;
         n[var1] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int Q(int var1) {
      v.u();
      short var3 = 220;
      if(var1 == 3) {
         var3 = 135;
      }

      if(var1 == 2) {
         var3 = 255;
      }

      if(var1 == 1) {
         var3 = 220;
      }

      if(var1 == 0) {
         var3 = 180;
      }

      int var4 = (this.L >> 16 & 255) * var3 / 255;
      int var5 = (this.L >> 8 & 255) * var3 / 255;
      int var6 = (this.L & 255) * var3 / 255;
      int var10000 = -16777216 | var4 << 16 | var5 << 8 | var6;
      d.h(new d[3]);
      return var10000;
   }

   public static h o(kw var0) {
      return P[var0.d()];
   }

   static {
      P[kw.WHITE.d()] = R;
      P[kw.ORANGE.d()] = p;
      P[kw.MAGENTA.d()] = h;
      P[kw.LIGHT_BLUE.d()] = TL;
      P[kw.YELLOW.d()] = Tr;
      P[kw.LIME.d()] = z;
      P[kw.PINK.d()] = e;
      P[kw.GRAY.d()] = b;
      P[kw.SILVER.d()] = Z;
      P[kw.CYAN.d()] = f;
      P[kw.PURPLE.d()] = Q;
      P[kw.BLUE.d()] = H;
      P[kw.BROWN.d()] = o;
      P[kw.GREEN.d()] = D;
      P[kw.RED.d()] = j;
      P[kw.BLACK.d()] = c;
   }

   private static IndexOutOfBoundsException a(IndexOutOfBoundsException var0) {
      return var0;
   }
}
