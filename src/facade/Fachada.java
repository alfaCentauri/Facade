/*
 * Copyright (C) 2021 Ricardo Presilla.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package facade;

/**
 *
 * @author Ricardo Presilla.
 * @version 1.0.
 */
public class Fachada {
    private Computadora computadora;
     /**
      * Contructor, instancia los componentes necesarios y el objeto computadora.
      */
    public Fachada() {
        IMouse mouse = new Mouse();
        ITeclado teclado = new Teclado();
        
        this.computadora = new Computadora(mouse, teclado);
    }
    
    /**
     * Operación de interes para aplicar el patron de diseño Facade.
     */
    public void encender(){
        /** pueden ser operaciones mas complejas y costosas computacionalmente. **/
        this.computadora.encender();
    }
}
