package net.y0;

import com.google.common.collect.Maps;
import java.util.Map;
import net.y0.d;
import net.y0.l;
import net.y6.ek;
import net.yz.m_;

public class m extends l {
   private static final Map C = Maps.newHashMap();
   private final float X;

   public m(d var1) {
      this(var1, 1.0F);
   }

   public m(d var1, float var2) {
      super(var1, new ek(), 0.75F);
      this.X = var2;
   }

   protected void X(net.yn.j var1, float var2) {
      net.y.d.W(this.X, this.X, this.X);
      super.N(var1, var2);
   }

   protected m_ J(net.yn.j var1) {
      return (m_)C.get(var1.getClass());
   }

   static {
      C.put(net.yn.o.class, new m_("textures/entity/horse/donkey.png"));
      C.put(net.yn.h.class, new m_("textures/entity/horse/mule.png"));
      C.put(net.yn.p.class, new m_("textures/entity/horse/horse_zombie.png"));
      C.put(net.yn.e.class, new m_("textures/entity/horse/horse_skeleton.png"));
   }
}
