package net.y6;

import net.y6.jb;

public class o extends net.y6.z {
   private final jb B;
   private final jb e;

   public o(float var1) {
      this.f = 256;
      this.C = 256;
      this.w("body.body", 0, 0);
      this.w("wing.skin", -56, 88);
      this.w("wingtip.skin", -56, 144);
      this.w("rearleg.main", 0, 0);
      this.w("rearfoot.main", 112, 0);
      this.w("rearlegtip.main", 196, 0);
      this.w("head.upperhead", 112, 30);
      this.w("wing.bone", 112, 88);
      this.w("head.upperlip", 176, 44);
      this.w("jaw.jaw", 176, 65);
      this.w("frontleg.main", 112, 104);
      this.w("wingtip.bone", 112, 136);
      this.w("frontfoot.main", 144, 104);
      this.w("neck.box", 192, 104);
      this.w("frontlegtip.main", 226, 138);
      this.w("body.scale", 220, 53);
      this.w("head.scale", 0, 0);
      this.w("neck.scale", 48, 0);
      this.w("head.nostril", 112, 0);
      float var10000 = -16.0F;
      this.B = new jb(this, "head");
      this.B.M("upperlip", -6.0F, -1.0F, -24.0F, 12, 5, 16);
      this.B.M("upperhead", -8.0F, -8.0F, -10.0F, 16, 16, 16);
      this.B.x = true;
      this.B.M("scale", -5.0F, -12.0F, -4.0F, 2, 4, 6);
      this.B.M("nostril", -5.0F, -3.0F, -22.0F, 2, 2, 4);
      this.B.x = false;
      this.B.M("scale", 3.0F, -12.0F, -4.0F, 2, 4, 6);
      this.B.M("nostril", 3.0F, -3.0F, -22.0F, 2, 2, 4);
      this.e = new jb(this, "jaw");
      this.e.n(0.0F, 4.0F, -8.0F);
      this.e.M("jaw", -6.0F, 0.0F, -16.0F, 12, 4, 16);
      this.B.s(this.e);
   }

   public void V(net.ne.l var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.e.b = (float)(Math.sin((double)(var2 * 3.1415927F * 0.2F)) + 1.0D) * 0.2F;
      this.B.N = var5 * 0.017453292F;
      this.B.b = var6 * 0.017453292F;
      net.y.d.O(0.0F, -0.374375F, 0.0F);
      net.y.d.W(0.75F, 0.75F, 0.75F);
      this.B.B(var7);
   }
}
