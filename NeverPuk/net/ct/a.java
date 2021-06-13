package net.ct;

import java.lang.reflect.Constructor;
import net.ct.t;
import net.z.tu;
import net.z.ww;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class a extends t {
   private static final Logger Z = LogManager.getLogger();
   private tu c;

   public void W(tu var1) {
      this.c = var1;
      Class var2 = Class.forName("com.mojang.realmsclient.RealmsMainScreen");
      Constructor var3 = var2.getDeclaredConstructor(new Class[]{t.class});
      var3.setAccessible(true);
      Object var4 = var3.newInstance(new Object[]{this});
      net.nn.j.b().s(((t)var4).o());
   }

   public ww Q(tu var1) {
      this.c = var1;
      Class var2 = Class.forName("com.mojang.realmsclient.gui.screens.RealmsNotificationsScreen");
      Constructor var3 = var2.getDeclaredConstructor(new Class[]{t.class});
      var3.setAccessible(true);
      Object var4 = var3.newInstance(new Object[]{this});
      return ((t)var4).o();
   }

   public void G() {
      net.nn.j.b().s(this.c);
   }
}
