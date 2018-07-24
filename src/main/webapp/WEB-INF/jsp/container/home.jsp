<%-- 
    Document   : home
    Created on : Dec 21, 2017, 7:15:38 PM
    Author     : DuyKhang
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div class="super_container">
    <div class="main_slider" style="background-image:url(../../../resources/images/slider_2.jpg)">
        <div class="container fill_height">
            <div class="row align-items-center fill_height">
                <div class="col">
                    <div class="main_slider_content">
                        <h1 style="color: #dc3545">Big Sale 50%</h1>
                        <div class="red_button shop_now_button"><a href="#">shop now</a></div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- New Arrivals -->

    <div class="new_arrivals">
        <div class="container">
            <div class="row">
                <div class="col text-center">
                    <div class="section_title new_arrivals_title">
                        <h2>New Arrivals</h2>
                    </div>
                </div>
            </div>
            <div class="row align-items-center">
                <div class="col text-center">
                    <div class="new_arrivals_sorting">
                        <ul class="arrivals_grid_sorting clearfix button-group filters-button-group">
                            <li class="grid_sorting_button button d-flex flex-column justify-content-center align-items-center active is-checked" data-filter="*">all</li>
                            <li class="grid_sorting_button button d-flex flex-column justify-content-center align-items-center" data-filter=".women">women's</li>
                            <li class="grid_sorting_button button d-flex flex-column justify-content-center align-items-center" data-filter=".accessories">accessories</li>
                            <li class="grid_sorting_button button d-flex flex-column justify-content-center align-items-center" data-filter=".men">men's</li>
                        </ul>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col">
                    <div class="product-grid" data-isotope='{ "itemSelector": ".product-item", "layoutMode": "fitRows" }' style="position: relative; height: 4333.91px;">

                        <!-- Product 1 -->

                        <div class="product-item men">
                            <div class="product discount product_filter">
                                <div class="product_image">
                                    <img src="../../../resources/images/product_1.png" alt="">
                                </div>
                                <div class="favorite favorite_left"></div>
                                <div class="product_bubble product_bubble_right product_bubble_red d-flex flex-column align-items-center"><span>-$20</span></div>
                                <div class="product_info">
                                    <h6 class="product_name"><a href="single.html">Fujifilm X100T 16 MP Digital Camera (Silver)</a></h6>
                                    <div class="product_price">$520.00<span>$590.00</span></div>
                                </div>
                            </div>
                            <div class="red_button add_to_cart_button"><a href="#">add to cart</a></div>
                        </div>

                        <!-- Product 2 -->

                        <div class="product-item women">
                            <div class="product product_filter">
                                <div class="product_image">
                                    <img src="../../../resources/images/product_2.png" alt="">
                                </div>
                                <div class="favorite"></div>
                                <div class="product_bubble product_bubble_left product_bubble_green d-flex flex-column align-items-center"><span>new</span></div>
                                <div class="product_info">
                                    <h6 class="product_name"><a href="single.html">Samsung CF591 Series Curved 27-Inch FHD Monitor</a></h6>
                                    <div class="product_price">$610.00</div>
                                </div>
                            </div>
                            <div class="red_button add_to_cart_button"><a href="#">add to cart</a></div>
                        </div>

                        <!-- Product 3 -->

                        <div class="product-item women">
                            <div class="product product_filter">
                                <div class="product_image">
                                    <img src="../../../resources/images/product_3.png" alt="">
                                </div>
                                <div class="favorite"></div>
                                <div class="product_info">
                                    <h6 class="product_name"><a href="single.html">Blue Yeti USB Microphone Blackout Edition</a></h6>
                                    <div class="product_price">$120.00</div>
                                </div>
                            </div>
                            <div class="red_button add_to_cart_button"><a href="#">add to cart</a></div>
                        </div>

                        <!-- Product 4 -->

                        <div class="product-item accessories">
                            <div class="product product_filter">
                                <div class="product_image">
                                    <img src="../../../resources/images/product_4.png" alt="">
                                </div>
                                <div class="product_bubble product_bubble_right product_bubble_red d-flex flex-column align-items-center"><span>sale</span></div>
                                <div class="favorite favorite_left"></div>
                                <div class="product_info">
                                    <h6 class="product_name"><a href="single.html">DYMO LabelWriter 450 Turbo Thermal Label Printer</a></h6>
                                    <div class="product_price">$410.00</div>
                                </div>
                            </div>
                            <div class="red_button add_to_cart_button"><a href="#">add to cart</a></div>
                        </div>

                        <!-- Product 5 -->

                        <div class="product-item women men">
                            <div class="product product_filter">
                                <div class="product_image">
                                    <img src="/../../../resources/images/product_5.png" alt="">
                                </div>
                                <div class="favorite"></div>
                                <div class="product_info">
                                    <h6 class="product_name"><a href="single.html">Pryma Headphones, Rose Gold & Grey</a></h6>
                                    <div class="product_price">$180.00</div>
                                </div>
                            </div>
                            <div class="red_button add_to_cart_button"><a href="#">add to cart</a></div>
                        </div>

                        <!-- Product 6 -->

                        <div class="product-item accessories">
                            <div class="product discount product_filter">
                                <div class="product_image">
                                    <img src="../../../resources/images/product_6.png" alt="">
                                </div>
                                <div class="favorite favorite_left"></div>
                                <div class="product_bubble product_bubble_right product_bubble_red d-flex flex-column align-items-center"><span>-$20</span></div>
                                <div class="product_info">
                                    <h6 class="product_name"><a href="#single.html">Fujifilm X100T 16 MP Digital Camera (Silver)</a></h6>
                                    <div class="product_price">$520.00<span>$590.00</span></div>
                                </div>
                            </div>
                            <div class="red_button add_to_cart_button"><a href="#">add to cart</a></div>
                        </div>

                        <!-- Product 7 -->

                        <div class="product-item women">
                            <div class="product product_filter">
                                <div class="product_image">
                                    <img src="../../../resources/images/product_7.png" alt="">
                                </div>
                                <div class="favorite"></div>
                                <div class="product_info">
                                    <h6 class="product_name"><a href="single.html">Samsung CF591 Series Curved 27-Inch FHD Monitor</a></h6>
                                    <div class="product_price">$610.00</div>
                                </div>
                            </div>
                            <div class="red_button add_to_cart_button"><a href="#">add to cart</a></div>
                        </div>

                        <!-- Product 8 -->

                        <div class="product-item accessories">
                            <div class="product product_filter">
                                <div class="product_image">
                                    <img src="../../../resources/images/product_8.png" alt="">
                                </div>
                                <div class="favorite"></div>
                                <div class="product_info">
                                    <h6 class="product_name"><a href="single.html">Blue Yeti USB Microphone Blackout Edition</a></h6>
                                    <div class="product_price">$120.00</div>
                                </div>
                            </div>
                            <div class="red_button add_to_cart_button"><a href="#">add to cart</a></div>
                        </div>

                        <!-- Product 9 -->

                        <div class="product-item men">
                            <div class="product product_filter">
                                <div class="product_image">
                                    <img src="../../../resources/images/product_9.png" alt="">
                                </div>
                                <div class="product_bubble product_bubble_right product_bubble_red d-flex flex-column align-items-center"><span>sale</span></div>
                                <div class="favorite favorite_left"></div>
                                <div class="product_info">
                                    <h6 class="product_name"><a href="single.html">DYMO LabelWriter 450 Turbo Thermal Label Printer</a></h6>
                                    <div class="product_price">$410.00</div>
                                </div>
                            </div>
                            <div class="red_button add_to_cart_button"><a href="#">add to cart</a></div>
                        </div>

                        <!-- Product 10 -->

                        <div class="product-item men">
                            <div class="product product_filter">
                                <div class="product_image">
                                    <img src="../../../resources/images/product_10.png" alt=""/>
                                </div>
                                <div class="favorite"></div>
                                <div class="product_info">
                                    <h6 class="product_name"><a href="single.html">Pryma Headphones, Rose Gold & Grey</a></h6>
                                    <div class="product_price">$180.00</div>
                                </div>
                            </div>
                            <div class="red_button add_to_cart_button"><a href="#">add to cart</a></div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<script src="../../../resources/js/categories_custom.js" type="text/javascript"></script>
<script src="../../../resources/styles/bootstrap4/popper.js" type="text/javascript"></script>
<script src="../../../resources/styles/bootstrap4/bootstrap.min.js" type="text/javascript"></script>
<script src="../../../resources/plugins/Isotope/isotope.pkgd.min.js" type="text/javascript"></script>
<script src="../../../resources/plugins/OwlCarousel2-2.2.1/owl.carousel.js" type="text/javascript"></script>
<script src="../../../resources/plugins/easing/easing.js" type="text/javascript"></script>
<script src="../../../resources/js/custom.js" type="text/javascript"></script>
