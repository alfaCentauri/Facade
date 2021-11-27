/*
 * Copyright (C) 2021 ricardo
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
public class Computadora {
    private IMouse mouse;
    private ITeclado teclado;
    
    public Computadora(IMouse mouse, ITeclado teclado){
        this.mouse = mouse;
        this.teclado = teclado;
    }
    
    /**
     * Algoritmo de interes para aplicar la fachada.
     */
    public void encender(){
        mouse.conectar();
        teclado.conectar();
    }
}
