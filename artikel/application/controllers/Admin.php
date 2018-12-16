<?php

    defined('BASEPATH') OR exit('No direct script access allowed');

    class Admin extends CI_Controller {

        public function __construct()
        {
            parent::__construct();
            $this->load->helper('url','form');
            $this->load->library('form_validation');
        }

        public function index()
        {
            $this->load->view('admin/index');
        }

    }

    /* End of file Admin.php */



?>