<?php

    defined('BASEPATH') OR exit('No direct script access allowed');

    require APPPATH . '/libraries/REST_Controller.php';
    use Restserver\Libraries\REST_Controller;

    class Register extends REST_Controller {

        function __construct($config = 'rest') {
            parent::__construct($config);
            $this->load->database();
        }

        public function index_post()
        {
            $data = array(
                'id_user'          => $this->post('id_user'),
                'nama'          => $this->post('nama'),
                'email'              => $this->post('email'),
                'password'     => $this->post('password'),
                );
                $insert = $this->db->insert('user', $data);
                if ($insert) {
                    $this->response(array('status' => 'sukses', 'result' => $data, 'message' => 'Berhasil'), 200);
                } else {
                    $this->response(array('status' => 'fail', 502));
            }
        }

        public function index_put()
        {
            $id_user = $this->put('id_user');
            $data = array(
                'id_user'          => $this->post('id_user'),
                'nama'          => $this->post('nama'),
                'email'              => $this->post('email'),
                'password'     => $this->post('password'));
                $this->db->where('id_user', $id_user);
                $update = $this->db->update('user', $data);
                if ($update) {
                    $this->response($data, 200);
                } else {
                    $this->response(array('status' => 'fail', 502));
            }
        }

    }

    /* End of file Register.php */

?>