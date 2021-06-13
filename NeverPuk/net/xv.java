package net;

import net.bt;
import net.n9.t;
import net.n9.y;

public class xv implements bt {
   private int N = -1;
   private String R = null;
   private t p = null;

   public xv(int var1, String var2, t var3) {
      this.N = var1;
      this.R = var2;
      this.p = var3;
   }

   public int A() {
      return this.N;
   }

   public String E() {
      return this.R;
   }

   public t Q() {
      return this.p;
   }

   public int q() {
      return this.p.L();
   }

   public void e() {
      y.R(this.p.L());
   }

   public String toString() {
      return "textureUnit: " + this.N + ", path: " + this.R + ", glTextureId: " + this.p.L();
   }
}
