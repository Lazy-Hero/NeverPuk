package net.yz;

import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;

public class ab {
   public int c;
   public int Q;

   public void P() {
      Mouse.setGrabbed(true);
      this.c = 0;
      this.Q = 0;
   }

   public void b() {
      Mouse.setCursorPosition(Display.getWidth() / 2, Display.getHeight() / 2);
      Mouse.setGrabbed(false);
   }

   public void L() {
      this.c = Mouse.getDX();
      this.Q = Mouse.getDY();
   }
}
