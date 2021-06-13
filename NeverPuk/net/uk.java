package net;

import java.util.Random;
import net.z.t;

public class uk {
   public float o;
   public float e;
   public float p;
   public float F;
   public float t;
   public float r;

   public uk(t var1, float var2, float var3) {
      this.o = (new Random()).nextFloat() * (float)var1.u();
      this.e = (new Random()).nextFloat() * (float)var1.v();
      this.t = (new Random()).nextFloat() * (float)var1.v() / 2.0F;
      this.p = var2;
      this.F = var3;
   }
}
