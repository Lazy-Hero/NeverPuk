package net.ne;

import net.nk.fc;

public enum q {
   MONSTER(fc.class, 70, net.y1.l.q, false, false),
   CREATURE(net.yn.w.class, 10, net.y1.l.q, true, true),
   AMBIENT(net.yn.v.class, 15, net.y1.l.q, true, false),
   WATER_CREATURE(net.yn.f.class, 5, net.y1.l.p, true, false);

   private final Class U;
   private final int y;
   private final net.y1.l D;
   private final boolean Y;
   private final boolean e;

   private q(Class var3, int var4, net.y1.l var5, boolean var6, boolean var7) {
      this.U = var3;
      this.y = var4;
      this.D = var5;
      this.Y = var6;
      this.e = var7;
   }

   public Class z() {
      return this.U;
   }

   public int y() {
      return this.y;
   }

   public boolean h() {
      return this.Y;
   }

   public boolean r() {
      return this.e;
   }
}
