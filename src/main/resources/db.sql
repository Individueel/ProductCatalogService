-- Automatically puts data in db when creating it

    INSERT INTO brand (name, country, image_url) VALUES
      ("Apple", "US", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRZ0oB4mcJKRwvUTySReKWZX5l2kqAXzTxMmRMdBFxucWGX_449WCjGYLAa5SgvzGnesg4&usqp=CAU"),
      ("Samsung", "SK", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRZ0oB4mcJKRwvUTySReKWZX5l2kqAXzTxMmRMdBFxucWGX_449WCjGYLAa5SgvzGnesg4&usqp=CAU"),
      ("Nike", "US", "https://static.nike.com/a/images/t_default/b6e11cbd-509d-483d-b21d-850e2d7924ca/alphafly-2-road-racing-shoes-fvDSdT.png");

    INSERT INTO category (ID, name, description) VALUES
      (1, "All", "Every product on the website"),
      (2, "Electronica", "All electronica products"),
      (3, "Clothing", "All clothing products"),
      (4, "Phones", "All mobile devices"),
      (5, "Watches", "All smart watches"),
      (6, "Earbuds", "All earbuds"),
      (7, "Computers", "All computers"),
      (8, "Shoes", "All shoes products");

    INSERT INTO category_parent (parent_id, id) VALUES
      (1, 4),
      (1, 5),
      (1, 6),
      (1, 7),
      (1, 8),
      (2, 4),
      (2, 5),
      (2, 6),
      (2, 7),
      (3, 8);

    INSERT INTO product (name, description, image_url, material, brand_id) VALUES
      ("Iphone 11", "An apple mobile which is nothing like an apple", "https://mobiel-product.imgix.net/16exp53phe4a103wu7u0r7g57qlm", "Metal", "1"),
      ("Apple Watch", "An apple watch which is nothing like an apple", "https://store.storeimages.cdn-apple.com/4668/as-images.apple.com/is/MKU93_VW_PF+watch-41-alum-starlight-nc-8s_VW_PF_WF_SI?wid=2000&hei=2000&fmt=png-alpha&.v=1632171032000%2C1661979030079", "Metal", "1"),
      ("Apple Earbuds", "Apple eardbuds that are nothing like an apple", "https://media.croma.com/image/upload/v1669124421/Croma%20Assets/Entertainment/Headphones%20and%20Earphones/Images/262015_0_hnwvzo.png", "Metal", "1"),
      ("Samsung S23", "An apple mobile which is nothing like an apple", "https://mobiel-product.imgix.net/1mxf0ks7sje5ee5t865zxs2i0gtk", "Metal", "2"),
      ("Samsung Galaxy Watch", "An apple watch which is nothing like an apple", "https://images.samsung.com/is/image/samsung/p6pim/uk/2208/gallery/uk-galaxy-watch5-40mm-sm-r900nzdaeua-thumb-533239098?$344_344_PNG$", "Metal", "2"),
      ("Samsung Wireless Buds", "Apple eardbuds that are nothing like an apple", "https://images.samsung.com/is/image/samsung/au/galaxy-note20/gallery/au-galaxy-buds-live-r180-sm-r180nznaasa-casefrontopencombinationmysticbronze-275665670?$650_519_PNG$", "Metal", "2"),
      ("Nike", "Boop", "https://static.nike.com/a/images/t_default/b6e11cbd-509d-483d-b21d-850e2d7924ca/alphafly-2-road-racing-shoes-fvDSdT.png", "Sillicone", "3");

    INSERT INTO product_category (product_id, category_id) VALUES
      (1, 4),
      (2, 5),
      (3, 6),
      (4, 4),
      (5, 5),
      (6, 6),
      (7, 8);

    INSERT INTO product_likes (product_id, likes) VALUES
      (1, "108992502999793757522");

    INSERT INTO product_colors (product_id, colors) VALUES
      (1, "PURPLE"),
      (2, "WHITE"),
      (3, "WHITE"),
      (4, "WHITE"),
      (5, "GREEN"),
      (6, "BLUE");

    INSERT INTO review (title, description, rating, product_id) VALUES
      ("Beautiful!", "Amazing!", 5, 1),
      ("Beautiful!", "Amazing!", 2, 2),
      ("Beautiful!", "Amazing!", 4, 2),
      ("Beautiful!", "Amazing!", 5, 2);