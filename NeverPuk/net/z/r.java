package net.z;

import com.ibm.icu.text.ArabicShaping;
import com.ibm.icu.text.Bidi;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import net.p8;
import net.u3;
import net.x7;
import net.z9;
import net.yz.m_;
import net.z.g;
import org.apache.commons.io.IOUtils;
import org.lwjgl.opengl.GL11;

public class r implements net.c9.v {
   private static final m_[] T = new m_[256];
   private static final net.nn.j X = net.nn.j.b();
   private final float[] N = new float[256];
   public int R = 9;
   public Random k = new Random();
   private final byte[] O = new byte[65536];
   private final int[] o = new int[32];
   private m_ B;
   private final net.n9.e C;
   public float G;
   public float z;
   private boolean x;
   public boolean Z;
   public float b;
   public float p;
   public float v;
   public float g;
   private int f;
   private boolean E;
   private boolean e;
   private boolean Q;
   private boolean m;
   private boolean W;
   private static final String V = "CL_00000660";
   public net.nr.d w;
   public m_ r;
   public boolean j = true;
   public float S = 1.0F;
   private final float[] L = new float[256];
   private boolean A = false;
   private final u3 K = new u3();

   public r(net.nr.d var1, m_ var2, net.n9.e var3, boolean var4) {
      this.w = var1;
      this.r = var2;
      this.B = var2;
      this.C = var3;
      this.x = var4;
      this.B = p8.y(this.r);
      this.t(this.B);
      int var5 = 0;

      while(true) {
         int var6 = (var5 >> 3 & 1) * 85;
         int var7 = (var5 >> 2 & 1) * 170 + var6;
         int var8 = (var5 >> 1 & 1) * 170 + var6;
         int var9 = (var5 >> 0 & 1) * 170 + var6;
         if(var1.iW) {
            int var10 = (var7 * 30 + var8 * 59 + var9 * 11) / 100;
            int var11 = (var7 * 30 + var8 * 70) / 100;
            int var12 = (var7 * 30 + var9 * 70) / 100;
            var7 = var10;
            var8 = var11;
            var9 = var12;
         }

         this.o[var5] = (var7 & 255) << 16 | (var8 & 255) << 8 | var9 & 255;
         ++var5;
      }
   }

   public int Y(String var1) {
      return this.R;
   }

   public float V(String var1, float var2, float var3, int var4) {
      this.W(var1, var2 - (float)this.r(var1) / 2.0F + 0.45F, var3 + 0.5F, var4, true);
      return (float)this.v(var1, var2 - (float)this.r(var1) / 2.0F, var3, var4);
   }

   public void s(net.c9.p var1) {
      this.B = p8.y(this.r);

      for(int var2 = 0; var2 < T.length; ++var2) {
         T[var2] = null;
      }

      this.p();
      this.L();
   }

   private void p() {
      BufferedImage var1 = net.n9.y.T(this.t(this.B));
      Properties var2 = p8.M(this.B);
      this.A = p8.I(var2, "blend", false);
      int var3 = var1.getWidth();
      int var4 = var1.getHeight();
      int var5 = var3 / 16;
      int var6 = var4 / 16;
      float var7 = (float)var3 / 128.0F;
      float var8 = z9.r(var7, 1.0F, 2.0F);
      this.S = 1.0F / var8;
      float var9 = p8.G(var2, "offsetBold", -1.0F);
      if(var9 >= 0.0F) {
         this.S = var9;
      }

      int[] var10 = new int[var3 * var4];
      var1.getRGB(0, 0, var3, var4, var10, 0, var3);
      int var11 = 0;

      while(true) {
         int var12 = var11 % 16;
         int var13 = var11 / 16;
         int var14 = 0;
         var14 = var5 - 1;
         int var15 = var12 * var5 + var14;
         boolean var16 = true;

         for(int var17 = 0; var17 < var6; ++var17) {
            int var18 = (var13 * var6 + var17) * var3;
            int var19 = var10[var15 + var18];
            int var20 = var19 >> 24 & 255;
            if(var20 > 16) {
               var16 = false;
            }
         }

         this.N[var11] = (float)(var14 + 1) / var7 + 1.0F;
         ++var11;
      }
   }

   private void L() {
      InputStream var1 = null;
      var1 = this.t(new m_("font/glyph_sizes.bin"));
      var1.read(this.O);
      IOUtils.closeQuietly(var1);
   }

   private float L(char var1, boolean var2) {
      if(var1 == 32) {
         return !this.x?this.N[var1]:4.0F;
      } else {
         int var3 = "ÀÁÂÈÊËÍÓÔÕÚßãõğİıŒœŞşŴŵžȇ\u0000\u0000\u0000\u0000\u0000\u0000\u0000 !\"#$%&\'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u0000ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»░▒▓│┤╡╢╖╕╣║╗╝╜╛┐└┴┬├─┼╞╟╚╔╩╦╠═╬╧╨╤╥╙╘╒╓╫╪┘┌█▄▌▐▀αβΓπΣσμτΦΘΩδ∞∅∈∩≡±≥≤⌠⌡÷≈°∙·√ⁿ²■\u0000".indexOf(var1);
         return var3 != -1 && !this.x?this.i(var3, var2):this.J(var1, var2);
      }
   }

   private float i(int var1, boolean var2) {
      int var3 = var1 % 16 * 8;
      int var4 = var1 / 16 * 8;
      byte var5 = 1;
      this.t(this.B);
      float var6 = this.N[var1];
      float var7 = 7.99F;
      GL11.glBegin(5);
      GL11.glTexCoord2f((float)var3 / 128.0F, (float)var4 / 128.0F);
      GL11.glVertex3f(this.G + (float)var5, this.z, 0.0F);
      GL11.glTexCoord2f((float)var3 / 128.0F, ((float)var4 + 7.99F) / 128.0F);
      GL11.glVertex3f(this.G - (float)var5, this.z + 7.99F, 0.0F);
      GL11.glTexCoord2f(((float)var3 + var7 - 1.0F) / 128.0F, (float)var4 / 128.0F);
      GL11.glVertex3f(this.G + var7 - 1.0F + (float)var5, this.z, 0.0F);
      GL11.glTexCoord2f(((float)var3 + var7 - 1.0F) / 128.0F, ((float)var4 + 7.99F) / 128.0F);
      GL11.glVertex3f(this.G + var7 - 1.0F - (float)var5, this.z + 7.99F, 0.0F);
      GL11.glEnd();
      return var6;
   }

   private m_ Q(int var1) {
      if(T[var1] == null) {
         T[var1] = new m_(String.format("textures/font/unicode_page_%02x.png", new Object[]{Integer.valueOf(var1)}));
         T[var1] = p8.y(T[var1]);
      }

      return T[var1];
   }

   private void C(int var1) {
      this.t(this.Q(var1));
   }

   private float J(char var1, boolean var2) {
      if(this.O[var1] == 0) {
         return 0.0F;
      } else {
         int var3 = var1 / 256;
         this.C(var3);
         int var4 = this.O[var1] >>> 4;
         int var5 = this.O[var1] & 15;
         var4 = var4 & 15;
         float var6 = (float)var4;
         float var7 = (float)(var5 + 1);
         float var8 = (float)(var1 % 16 * 16) + var6;
         float var9 = (float)((var1 & 255) / 16 * 16);
         float var10 = var7 - var6 - 0.02F;
         float var11 = 1.0F;
         GL11.glBegin(5);
         GL11.glTexCoord2f(var8 / 256.0F, var9 / 256.0F);
         GL11.glVertex3f(this.G + var11, this.z, 0.0F);
         GL11.glTexCoord2f(var8 / 256.0F, (var9 + 15.98F) / 256.0F);
         GL11.glVertex3f(this.G - var11, this.z + 7.99F, 0.0F);
         GL11.glTexCoord2f((var8 + var10) / 256.0F, var9 / 256.0F);
         GL11.glVertex3f(this.G + var10 / 2.0F + var11, this.z, 0.0F);
         GL11.glTexCoord2f((var8 + var10) / 256.0F, (var9 + 15.98F) / 256.0F);
         GL11.glVertex3f(this.G + var10 / 2.0F - var11, this.z + 7.99F, 0.0F);
         GL11.glEnd();
         return (var7 - var6) / 2.0F + 1.0F;
      }
   }

   public int U(String var1, float var2, float var3, int var4) {
      return this.W(var1, var2, var3, var4, true);
   }

   public int v(String var1, float var2, float var3, int var4) {
      return !this.j?0:this.W(var1, var2, var3, var4, false);
   }

   public int W(String var1, float var2, float var3, int var4, boolean var5) {
      this.t();
      if(this.A) {
         net.y.d.j(this.K);
         net.y.d.C();
         net.y.d.D(770, 771);
      }

      this.n();
      int var6 = this.c(var1, var2 + 1.0F, var3 + 1.0F, var4, true);
      var6 = Math.max(var6, this.c(var1, var2, var3, var4, false));
      if(this.A) {
         net.y.d.A(this.K);
      }

      return var6;
   }

   public String u(String var1) {
      Bidi var2 = new Bidi((new ArabicShaping(8)).shape(var1), 127);
      var2.setReorderingMode(0);
      return var2.writeReordered(2);
   }

   private void n() {
      this.E = false;
      this.e = false;
      this.Q = false;
      this.m = false;
      this.W = false;
   }

   private void p(String var1, boolean var2) {
      g.C();
      int var4 = 0;
      if(var4 < var1.length()) {
         char var5 = var1.charAt(var4);
         if(var5 == 167 && var4 + 1 < var1.length()) {
            int var6 = "0123456789abcdefklmnor".indexOf(var1.toLowerCase().charAt(var4 + 1));
            if(var6 < 16) {
               this.E = false;
               this.e = false;
               this.W = false;
               this.m = false;
               this.Q = false;
               if(var6 < 0 || var6 > 15) {
                  var6 = 15;
               }

               if(var2) {
                  var6 += 16;
               }

               int var7 = this.o[var6];
               if(z9.v()) {
                  var7 = x7.C(var6, var7);
               }

               this.f = var7;
               this.P((float)(var7 >> 16) / 255.0F, (float)(var7 >> 8 & 255) / 255.0F, (float)(var7 & 255) / 255.0F, this.g);
            }

            if(var6 == 16) {
               this.E = true;
            }

            if(var6 == 17) {
               this.e = true;
            }

            if(var6 == 18) {
               this.W = true;
            }

            if(var6 == 19) {
               this.m = true;
            }

            if(var6 == 20) {
               this.Q = true;
            }

            if(var6 == 21) {
               this.E = false;
               this.e = false;
               this.W = false;
               this.m = false;
               this.Q = false;
               this.P(this.b, this.p, this.v, this.g);
            }

            ++var4;
         }

         int var11 = "ÀÁÂÈÊËÍÓÔÕÚßãõğİıŒœŞşŴŵžȇ\u0000\u0000\u0000\u0000\u0000\u0000\u0000 !\"#$%&\'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u0000ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»░▒▓│┤╡╢╖╕╣║╗╝╜╛┐└┴┬├─┼╞╟╚╔╩╦╠═╬╧╨╤╥╙╘╒╓╫╪┘┌█▄▌▐▀αβΓπΣσμτΦΘΩδ∞∅∈∩≡±≥≤⌠⌡÷≈°∙·√ⁿ²■\u0000".indexOf(var5);
         if(this.E && var11 != -1) {
            int var12 = this.Y(var5);

            char var8;
            while(true) {
               var11 = this.k.nextInt("ÀÁÂÈÊËÍÓÔÕÚßãõğİıŒœŞşŴŵžȇ\u0000\u0000\u0000\u0000\u0000\u0000\u0000 !\"#$%&\'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u0000ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»░▒▓│┤╡╢╖╕╣║╗╝╜╛┐└┴┬├─┼╞╟╚╔╩╦╠═╬╧╨╤╥╙╘╒╓╫╪┘┌█▄▌▐▀αβΓπΣσμτΦΘΩδ∞∅∈∩≡±≥≤⌠⌡÷≈°∙·√ⁿ²■\u0000".length());
               var8 = "ÀÁÂÈÊËÍÓÔÕÚßãõğİıŒœŞşŴŵžȇ\u0000\u0000\u0000\u0000\u0000\u0000\u0000 !\"#$%&\'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u0000ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»░▒▓│┤╡╢╖╕╣║╗╝╜╛┐└┴┬├─┼╞╟╚╔╩╦╠═╬╧╨╤╥╙╘╒╓╫╪┘┌█▄▌▐▀αβΓπΣσμτΦΘΩδ∞∅∈∩≡±≥≤⌠⌡÷≈°∙·√ⁿ²■\u0000".charAt(var11);
               if(var12 == this.Y(var8)) {
                  break;
               }
            }

            var5 = var8;
         }

         float var13 = var11 != -1 && !this.x?this.S:0.5F;
         if((var5 == 0 || var11 == -1 || this.x) && var2) {
            boolean var14 = true;
         } else {
            boolean var10000 = false;
         }

         this.G -= var13;
         this.z -= var13;
         float var9 = this.L(var5, this.Q);
         if(this.e) {
            this.G += var13;
            this.L(var5, this.Q);
            this.G -= var13;
            var9 += var13;
         }

         this.L(var9);
         ++var4;
      }

   }

   protected void L(float var1) {
      if(this.W) {
         net.y.r var2 = net.y.r.f();
         net.y.p var3 = var2.k();
         net.y.d.w();
         var3.m(7, net.y8.x.y);
         var3.H((double)this.G, (double)(this.z + (float)(this.R / 2)), 0.0D).W();
         var3.H((double)(this.G + var1), (double)(this.z + (float)(this.R / 2)), 0.0D).W();
         var3.H((double)(this.G + var1), (double)(this.z + (float)(this.R / 2) - 1.0F), 0.0D).W();
         var3.H((double)this.G, (double)(this.z + (float)(this.R / 2) - 1.0F), 0.0D).W();
         var2.p();
         net.y.d.S();
      }

      if(this.m) {
         net.y.r var5 = net.y.r.f();
         net.y.p var6 = var5.k();
         net.y.d.w();
         var6.m(7, net.y8.x.y);
         int var4 = this.m?-1:0;
         var6.H((double)(this.G + (float)var4), (double)(this.z + (float)this.R), 0.0D).W();
         var6.H((double)(this.G + var1), (double)(this.z + (float)this.R), 0.0D).W();
         var6.H((double)(this.G + var1), (double)(this.z + (float)this.R - 1.0F), 0.0D).W();
         var6.H((double)(this.G + (float)var4), (double)(this.z + (float)this.R - 1.0F), 0.0D).W();
         var5.p();
         net.y.d.S();
      }

      this.G += var1;
   }

   private int G(String var1, int var2, int var3, int var4, int var5, boolean var6) {
      if(this.Z) {
         int var7 = this.r(this.u(var1));
         var2 = var2 + var4 - var7;
      }

      return this.c(var1, (float)var2, (float)var3, var5, var6);
   }

   protected int c(String var1, float var2, float var3, int var4, boolean var5) {
      return 0;
   }

   public int r(String var1) {
      return 0;
   }

   public int Y(char var1) {
      return Math.round(this.C(var1));
   }

   private float C(char var1) {
      if(var1 == 167) {
         return -1.0F;
      } else if(var1 == 32) {
         return this.N[32];
      } else {
         int var2 = "ÀÁÂÈÊËÍÓÔÕÚßãõğİıŒœŞşŴŵžȇ\u0000\u0000\u0000\u0000\u0000\u0000\u0000 !\"#$%&\'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u0000ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»░▒▓│┤╡╢╖╕╣║╗╝╜╛┐└┴┬├─┼╞╟╚╔╩╦╠═╬╧╨╤╥╙╘╒╓╫╪┘┌█▄▌▐▀αβΓπΣσμτΦΘΩδ∞∅∈∩≡±≥≤⌠⌡÷≈°∙·√ⁿ²■\u0000".indexOf(var1);
         if(var2 != -1 && !this.x) {
            return this.N[var2];
         } else if(this.O[var1] != 0) {
            int var3 = this.O[var1] >>> 4;
            int var4 = this.O[var1] & 15;
            var3 = var3 & 15;
            ++var4;
            return (float)((var4 - var3) / 2 + 1);
         } else {
            return 0.0F;
         }
      }
   }

   public String Q(String var1, int var2) {
      return this.c(var1, var2, false);
   }

   public String c(String var1, int var2, boolean var3) {
      StringBuilder var4 = new StringBuilder();
      float var5 = 0.0F;
      int var6 = var1.length() - 1;
      byte var7 = -1;
      boolean var8 = false;
      boolean var10000 = false;

      for(int var10 = var6; var10 < var1.length() && var5 < (float)var2; var10 += var7) {
         char var11 = var1.charAt(var10);
         this.C(var11);
         var8 = false;
         if(var11 != 108 && var11 != 76) {
            if(var11 == 114 || var11 == 82) {
               var10000 = false;
            }
         } else {
            var10000 = true;
         }

         if(var5 > (float)var2) {
            break;
         }

         var4.insert(0, var11);
      }

      return var4.toString();
   }

   private String A(String var1) {
      while(var1.endsWith("\n")) {
         var1 = var1.substring(0, var1.length() - 1);
      }

      return var1;
   }

   public void O(String var1, int var2, int var3, int var4, int var5) {
      if(this.A) {
         net.y.d.j(this.K);
         net.y.d.C();
         net.y.d.D(770, 771);
      }

      this.n();
      this.f = var5;
      var1 = this.A(var1);
      this.f(var1, var2, var3, var4, false);
      if(this.A) {
         net.y.d.A(this.K);
      }

   }

   private void f(String var1, int var2, int var3, int var4, boolean var5) {
      for(String var7 : this.m(var1, var4)) {
         this.G(var7, var2, var3, var4, this.f, var5);
         var3 += this.R;
      }

   }

   public void Z(String var1, float var2, float var3, int var4) {
      var2 = var2 - (float)this.r(var1) / 2.0F;
      this.U(var1, var2, var3, var4);
   }

   public int t(String var1, int var2) {
      return this.R * this.m(var1, var2).size();
   }

   public void d(boolean var1) {
      this.x = var1;
   }

   public boolean p() {
      return this.x;
   }

   public void A(boolean var1) {
      this.Z = var1;
   }

   public List m(String var1, int var2) {
      return Arrays.asList(this.W(var1, var2).split("\n"));
   }

   String W(String var1, int var2) {
      if(var1.length() <= 1) {
         return var1;
      } else {
         int var3 = this.N(var1, var2);
         if(var1.length() <= var3) {
            return var1;
         } else {
            String var4 = var1.substring(0, var3);
            char var5 = var1.charAt(var3);
            boolean var6 = var5 == 32 || var5 == 10;
            String var7 = N(var4) + var1.substring(var3 + 1);
            return var4 + "\n" + this.W(var7, var2);
         }
      }
   }

   private int N(String var1, int var2) {
      int var3 = var1.length();
      float var10 = 0.0F;
      int var5 = 0;
      boolean var6 = true;

      for(boolean var7 = false; var5 < var3; ++var5) {
         char var8 = var1.charAt(var5);
         switch(var8) {
         case '\n':
            --var5;
            break;
         case ' ':
         default:
            var10 += this.C(var8);
            ++var10;
            break;
         case '§':
            if(var5 < var3 - 1) {
               ++var5;
               char var9 = var1.charAt(var5);
               if(var9 != 108 && var9 != 76) {
                  if(var9 == 114 || var9 == 82 || f(var9)) {
                     var7 = false;
                  }
               } else {
                  var7 = true;
               }
            }
         }

         if(var8 == 10) {
            ++var5;
            break;
         }

         if(Math.round(var10) > var2) {
            break;
         }
      }

      if(var5 != var3) {
         ;
      }

      return var5;
   }

   private static boolean f(char var0) {
      return var0 >= 48 && var0 <= 57 || var0 >= 97 && var0 <= 102 || var0 >= 65 && var0 <= 70;
   }

   private static boolean M(char var0) {
      return var0 >= 107 && var0 <= 111 || var0 >= 75 && var0 <= 79 || var0 == 114 || var0 == 82;
   }

   public static String N(String var0) {
      String var1 = "";
      int var2 = -1;
      int var3 = var0.length();

      while((var2 = var0.indexOf(167, var2 + 1)) != -1) {
         if(var2 < var3 - 1) {
            char var4 = var0.charAt(var2 + 1);
            if(f(var4)) {
               var1 = "§" + var4;
            } else if(M(var4)) {
               var1 = var1 + "§" + var4;
            }
         }
      }

      return var1;
   }

   public boolean y() {
      return this.Z;
   }

   public int Z(char var1) {
      int var2 = "0123456789abcdef".indexOf(var1);
      if(var2 < this.o.length) {
         int var3 = this.o[var2];
         if(z9.v()) {
            var3 = x7.C(var2, var3);
         }

         return var3;
      } else {
         return 16777215;
      }
   }

   protected void P(float var1, float var2, float var3, float var4) {
      net.y.d.T(var1, var2, var3, var4);
   }

   protected void t() {
      net.y.d.m();
   }

   protected void t(m_ var1) {
      this.C.E(var1);
   }

   protected InputStream t(m_ var1) throws IOException {
      return net.nn.j.b().C().A(var1).k();
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
