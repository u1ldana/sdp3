 **Assignment 1: Audio Player**
In this assignment, I used the **Adapter Pattern** to extend a music player that originally only supported MP3 files, adding the ability to play WAV and AAC files. I created an adapter to connect the existing MP3 player with advanced audio players, allowing the player to handle new file formats without changing the core functionality. This pattern helped me maintain compatibility while easily expanding the system's capabilities.

**Assignment 2: Remote Control System**
Here, I applied the **Bridge Pattern** to design a universal remote control system for devices such as TVs, DVD players, and sound systems. I separated the device functionality from the remote control, enabling one remote to work with multiple devices. This approach increased the flexibility of the system and made it easier to add new devices in the future, without modifying the remote control logic.

**Assignment 3: Menu System**
For the restaurant menu system, I implemented the **Composite Pattern** to build a multi-level menu where each menu item could either be a dish or a sub-menu. I added functionality to add and remove menu components, making the menu structure flexible and easy to manage. This pattern allowed me to create complex nested menus while keeping management simple and scalable.

**Assignment 4: Pizza Ordering System**
I used the **Decorator Pattern** to create a pizza ordering system with flexible topping customization. Each topping was added as a decorator to the base pizza, allowing customers to easily personalize their orders. This pattern enabled me to add multiple toppings to a pizza without altering the core pizza logic, making the customization process intuitive and easy to scale.

**Assignment 5: Smart Home System**
In this task, I utilized the **Facade Pattern** to simplify the control of a smart home system, which included devices like lights, thermostats, security systems, and entertainment systems. I built a facade that provided a single interface for managing all devices, simplifying complex scenarios such as "night mode" or "movie mode." This made the system more user-friendly by hiding the complexities of individual device interactions.
**Assignment 6:  Character Rendering in a Text Editor**
For the text editor, I used the **Flyweight Pattern** to optimize memory usage when rendering a large number of characters. I separated the intrinsic state (such as font and size) from the extrinsic state (like position) and used a character factory to manage the creation of character objects. This pattern allowed me to reduce memory consumption significantly while handling large documents efficiently.

**Assignment 7: Online Learning Platform**
In the online learning platform, I implemented the **Proxy Pattern** to enable lazy loading of video lectures. The videos were only loaded when the student started watching them. This pattern helped me optimize resource usage by delaying the loading of video content until it was necessary, improving platform performance and providing a smoother user experience.
