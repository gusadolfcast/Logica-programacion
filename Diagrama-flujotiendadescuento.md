```mermaid
flowchart TD
    A([INICIO]) --> B[/Leer producto y precio por teclado/]
    B --> C{"¿precio >= 500000?"}
    
    C -- Sí --> D["descuento = 20%"]
    C -- No --> E{"¿precio >= 300000?"}
    
    E -- Sí --> F["descuento = 15%"]
    E -- No --> G{"¿precio >= 100000?"}
    
    G -- Sí --> H["descuento = 10%"]
    G -- No --> I["descuento = 0%"]
    
    D --> J["valorDescuento = precio * descuento / 100"]
    F --> J
    H --> J
    I --> J
    
    J --> K["subtotal = precio - valorDescuento"]
    K --> L["valorIva = subtotal * 19 / 100"]
    L --> M["total = subtotal + valorIva"]
    
    M --> N[/Mostrar Resumen de Compra en pantalla/]
    N --> O([FIN])