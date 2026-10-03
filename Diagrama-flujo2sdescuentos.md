```mermaid
flowchart TD
    A([Inicio]) --> B[/Solicitar Nombre del Cliente/]
    B --> C[/Solicitar Valor de la Compra/]
    C --> D{"¿Compra >= 300000?"}
    
    D -- Sí --> E["Porcentaje = 20%"]
    D -- No --> F{"¿Compra >= 200000?"}
    
    F -- Sí --> G["Porcentaje = 15%"]
    F -- No --> H{"¿Compra >= 100000?"}
    
    H -- Sí --> I["Porcentaje = 10%"]
    H -- No --> J["Porcentaje = 0%"]
    
    E --> K["Calcular Valor Descontado = Compra * Porcentaje"]
    G --> K
    I --> K
    J --> K
    
    K --> L["Calcular Total a Pagar = Compra - Valor Descontado"]
    L --> M[/Mostrar Resumen Personalizado de Compra/]
    M --> N([Fin])